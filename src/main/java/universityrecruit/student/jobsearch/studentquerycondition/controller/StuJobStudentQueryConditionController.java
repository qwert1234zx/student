/**
 * The controller of StudentQueryCondition，该文件继承于BaseController，其中insert、update、deleteByIdList、selectByCondition可不用写
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.student.jobsearch.studentquerycondition.controller;

import com.each.common.base.controller.BaseController;
import com.each.common.base.page.PageWriter;
import com.github.pagehelper.PageInfo;
import common.context.Context;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import universityrecruit.student.jobsearch.studentquerycondition.entity.*;
import universityrecruit.student.jobsearch.studentquerycondition.service.IStudentQueryConditionService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/student/jobsearch/studentquerycondition")
public class StuJobStudentQueryConditionController extends BaseController {

    @Resource(name = "StuJobStudentQueryConditionService")
    private IStudentQueryConditionService oiStudentQueryConditionService;

    @Autowired
    public StuJobStudentQueryConditionController(IStudentQueryConditionService oTempStudentQueryConditionService){
        this.baseService = oTempStudentQueryConditionService;
        this.oiStudentQueryConditionService = oTempStudentQueryConditionService;
    }

    /**
     * 显示整个列表页面，一次查询该页面所有子模块的数据并返回整个页面，页面中需动态刷新的子模块另外单独写方法
     *
     * @return The URL of list page of TestTable
     * @throws Exception
     */
    @RequestMapping(value = "/searchAll")
    public String searchAll(Model model, @RequestParam(required = true) Integer pageNum) {
        try {
            //根据查询条件形成当前分页数据
            PageInfo<StudentQueryCondition> pageInfo = oiStudentQueryConditionService.selectByCondition(pageNum, Context.PAGE_COUNT, null);

            //分离出分页器所带的数据集，以便JSP中的表格进行绑定
            model.addAttribute("DataList", pageInfo.getList());

            //赋值分页的链接地址，建议采用AJAX的分页链接地址（普通的请求地址如"/StudentQueryCondition/searchAll"）
            PageWriter<StudentQueryCondition> pageWriter = new PageWriter<StudentQueryCondition>(null, pageInfo);

            //生成分页器HTML
            pageWriter.generatePager();

            //将分页器的分页字符串返回前台JSP
            model.addAttribute("PageString", pageWriter.getPagerString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "/student/jobsearch/studentquerycondition/StudentQueryConditionList";
    }

	/**
     * 根据条件查询具体模块，采用AJAX模式，通常用于局部刷新
     *
     * @return The URL of list page of StudentQueryCondition
     * @throws Exception
     */
    @RequestMapping(value = "/search")
    @ResponseBody
    public PageWriter<StudentQueryCondition> search(@RequestParam(required = true) Integer pageNum,  @RequestParam(required = true) String queryName, @RequestParam(required = true) Integer studentID) {
        PageWriter<StudentQueryCondition> pageWriter = null;
        try {
            //拼接查询条件Map
            Map<String, Object> condition = new HashMap<String, Object>();
			
			condition.put("QueryName",queryName);
			condition.put("StudentID",studentID);

            PageInfo<StudentQueryCondition> pageInfo = oiStudentQueryConditionService.selectByCondition(pageNum, Context.PAGE_COUNT, condition);

            //赋值分页的链接地址，建议采用AJAX的分页链接地址（下面被注解掉的是普通的请求地址）
            pageWriter = new PageWriter<StudentQueryCondition>(null, pageInfo);
            pageWriter.generatePager();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pageWriter;
    }
	
    /**
     * 添加页面跳转，在Spring中JSP要通过Controller访问另外的JSP
     *
     * @return The URL of add page of StudentQueryCondition
     * @throws Exception
     */
    @RequestMapping(value = "/addForward")
    public ModelAndView addForward() throws Exception {
        return new ModelAndView("/student/jobsearch/studentquerycondition/StudentQueryConditionAdd");
    }

    /**
     * 更新页面跳转
     *
     * @param testTableId
     * @return The URL of update page of StudentQueryCondition
     * @throws Exception
     */
    @RequestMapping(value = "/updateForward")
    public ModelAndView updateForward(@RequestParam Integer testTableId) throws Exception {
        //根据ID查询出记录，再返回到修改页面
        StudentQueryCondition oStudentQueryCondition = oiStudentQueryConditionService.selectByID(testTableId);
        return new ModelAndView("/student/jobsearch/studentquerycondition/StudentQueryConditionUpdate", "StudentQueryCondition", oStudentQueryCondition);
    }
    //分界线

    @RequestMapping(value = "/ser")
    public String ser(Model model){
        List<Province> resultProvince=oiStudentQueryConditionService.selectProvince();
        List<Industry> resultIndustry=oiStudentQueryConditionService.selectIndustry();
        List<JobCategory> resultJobCategory=oiStudentQueryConditionService.selectJobCategory();
        List<EnterpriseType> resultEnterpriseType=oiStudentQueryConditionService.selectEnterpriseType();
//        System.out.println(resultProvince);
//        System.out.println(resultIndustry);
//        System.out.println(resultJobCategory);
//        System.out.println(resultEnterpriseType);
        model.addAttribute("resultProvince",resultProvince);
        model.addAttribute("resultIndustry",resultIndustry);
        model.addAttribute("resultJobCategory",resultJobCategory);
        model.addAttribute("resultEnterpriseType",resultEnterpriseType);
        return "/student/jobsearch/studentquerycondition/testsucc";
    }

    @RequestMapping(value = "watchone")//查看功能
    public String watch1(@RequestParam("id") Integer id,Model model){
        Map<String,Object> map=oiStudentQueryConditionService.preselectResultsforwatch(id);
        System.out.println(map);
        List<Province> pro= (List<Province>) map.get("pro");
        List<JobCategory> job= (List<JobCategory>) map.get("job");
        List<Industry> industry= (List<Industry>) map.get("industry");
        List<EnterpriseType> entertype=(List<EnterpriseType>) map.get("etype");
        Othercondition othercondition= (Othercondition) map.get("othercondition");
        StudentQueryCondition sqc=(StudentQueryCondition) map.get("sqc") ;

        model.addAttribute("sqc",sqc);
        model.addAttribute("pro",pro);
        model.addAttribute("job",job);
        model.addAttribute("industry",industry);
        model.addAttribute("entertype",entertype);
        model.addAttribute("othercondition",othercondition);
        return "/student/jobsearch/studentquerycondition/watchone";
    }
    @RequestMapping(value = "/watch")
    public String watch(@RequestParam("id") Integer id, Model model){
        List<Province> resultProvince=oiStudentQueryConditionService.selectProvince();
        List<Industry> resultIndustry=oiStudentQueryConditionService.selectIndustry();
        List<JobCategory> resultJobCategory=oiStudentQueryConditionService.selectJobCategory();
        List<EnterpriseType> resultEnterpriseType=oiStudentQueryConditionService.selectEnterpriseType();

        Map<String,Object> map=oiStudentQueryConditionService.preselectResults(id);
        System.out.println(map);
        StudentQueryCondition sqc= (StudentQueryCondition) map.get("sqc");
        List<Integer> proid= (List<Integer>) map.get("proid");
        List<Integer> jobid= (List<Integer>) map.get("jobid");
        List<Integer> industryid= (List<Integer>) map.get("industryid");
        List<Integer> entertypeid=(List<Integer>) map.get("entertypeid");
        Othercondition othercondition= (Othercondition) map.get("othercondition");

        model.addAttribute("sqc",sqc);
        model.addAttribute("proid",proid);
        model.addAttribute("jobid",jobid);
        model.addAttribute("industryid",industryid);
        model.addAttribute("entertypeid",entertypeid);
        model.addAttribute("othercondition",othercondition);

        model.addAttribute("id",id);
        model.addAttribute("resultProvince",resultProvince);
        model.addAttribute("resultIndustry",resultIndustry);
        model.addAttribute("resultJobCategory",resultJobCategory);
        model.addAttribute("resultEnterpriseType",resultEnterpriseType);
        return "/student/jobsearch/studentquerycondition/updatetest";
    }

    @RequestMapping(value = "/result")        //点击执行跳转到这查结果
    public String result(@RequestParam("id") Integer ids,Model model){
//        System.out.println("最新的id"+ids);
        Map<String,Object> map=oiStudentQueryConditionService.preselectResults(ids);//根据Id查出所有与该条件绑定的内容
//        System.out.println(map);
        List<Results> results=oiStudentQueryConditionService.selectResults(map);//最后结果
//        System.out.println(results);
        model.addAttribute("results",results);
        return "/student/jobsearch/studentquerycondition/result";
    }

    @RequestMapping(value = "updatejobsearch")
    @ResponseBody
    public Integer updatejob(@RequestParam("entity") String var1){
        Map var2 = (Map)this.gson.fromJson(var1, Map.class);
        System.out.println(var2);
        Integer id=Integer.parseInt(String.valueOf(var2.get("Id")));
        if(var2.get("QueryName")==null||var2.get("QueryName").equals("")){
            return 0;
        }
        Integer a=oiStudentQueryConditionService.updatestudentquerycondition(var2);
        oiStudentQueryConditionService.deleteall(id);//先删除绑定的内容
        Integer b=oiStudentQueryConditionService.addenterpriseaddresscondition1(var2,id);
        Integer c=oiStudentQueryConditionService.addjobcategorycondition(var2,id);

        Integer d=oiStudentQueryConditionService.addindustrycondition(var2,id);
        Integer e=oiStudentQueryConditionService.addenterprisetypecondition(var2,id);
        Integer f=oiStudentQueryConditionService.addother(var2,id);
        if(a+b+c+d+e+f>=1) {
            return 1;
        }
        else return 0;
    }

    @RequestMapping(value = "/addjobsearch1")
    @ResponseBody
    public Integer addjobsearch1(@RequestParam("entity") String var1){
//        System.out.println(var1);
        Integer a=0,b=0,c=0,d=0,e=0,f=0;
        Map var2 = (Map)this.gson.fromJson(var1, Map.class);//每个数组类型转换为ArrayList类型
        //先忽略查询省份和职位
        var2.put("Studentid",1);
        StudentQueryCondition sqc=new StudentQueryCondition();
        sqc.setStudentID((Integer) var2.get("Studentid"));
        sqc.setQueryName((String) var2.get("QueryName"));
        if(sqc.getQueryName()==null||sqc.getQueryName().equals("")){      //查询条件name为空则插入失败
            return 0;
        }
        a=oiStudentQueryConditionService.addStudentquerycondition(sqc);//9.23主表:这个必须要用类，因为要返回id
        var2.put("StudentQueryCondition",sqc.getStudentQueryCondition());
        Integer stuqcid=sqc.getStudentQueryCondition();
        System.out.println(var2);
        ArrayList<Integer> list1=(ArrayList<Integer>) var2.get("Provinceid");
        ArrayList<Integer> list2=(ArrayList<Integer>) var2.get("JobCategoryid");
        ArrayList<Integer> list3=(ArrayList<Integer>) var2.get("Industryid");
        ArrayList<Integer> list4=(ArrayList<Integer>) var2.get("EnterpriseTypeid");
        if(list1!=null&&list1.size()!=0){
            List<Enterpriseaddresscondition> newenter = new ArrayList<Enterpriseaddresscondition>();
            for (int i = 0; i < list1.size(); i++) {
                Enterpriseaddresscondition en = new Enterpriseaddresscondition();
                en.setStudentQueryConditionID(stuqcid);
                en.setProvinceID(Integer.parseInt(String.valueOf(list1.get(i))));//类型转换
                newenter.add(en);
            }
//        System.out.println("信心的"+newenter);
            b = oiStudentQueryConditionService.addenterpriseaddresscondition(newenter);
//        System.out.println("执行省份完毕");
        }
        //处理工作类型
        if(list2!=null&&list2.size()!=0) {
            c = oiStudentQueryConditionService.addjobcategorycondition(var2, stuqcid);
//        System.out.println("执行工作完毕");
        }

        if(list3!=null&&list3.size()!=0) {
            //处理行业
            d = oiStudentQueryConditionService.addindustrycondition(var2, stuqcid);
//        System.out.println("行业执行完毕");
        }

        if(list4!=null&&list4.size()!=0) {
            e = oiStudentQueryConditionService.addenterprisetypecondition(var2, stuqcid);
//        System.out.println("公司类型执行完毕");
        }

        f=oiStudentQueryConditionService.addother(var2,stuqcid);
        if(a+b+c+d+e+f>=1) {
            return 1;
        }
        else return 0;
    }


    @RequestMapping({"/deleteByIdList1"})
    @ResponseBody
    public Integer deleteByIdList1(@RequestParam("checkedlist") String var1) {
        try {

            List var2 = (List)this.gson.fromJson(var1, List.class);
            System.out.println(var1);
            return oiStudentQueryConditionService.deleteByIdList1(var2);
        } catch (Exception var3) {
            var3.printStackTrace();
            return Integer.valueOf(Integer.parseInt("0"));
        }
    }


}
