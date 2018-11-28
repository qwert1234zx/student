/**
 * The controller of University，该文件继承于BaseController，其中insert、update、deleteByIdList、selectByCondition可不用写
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.university.infomationmanagement.university.controller;

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
import universityrecruit.university.infomationmanagement.university.entity.Degree;
import universityrecruit.university.infomationmanagement.university.entity.Province;
import universityrecruit.university.infomationmanagement.university.entity.Universityresult;
import universityrecruit.university.infomationmanagement.university.service.IUniversityService;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/university/infomationmanagement/university")
public class UniInfUniversityController extends BaseController {

    @Resource(name = "UniInfUniversityService")
    private IUniversityService oiUniversityService;

    @Autowired
    public UniInfUniversityController(IUniversityService oTempUniversityService){
        this.baseService = oTempUniversityService;
        this.oiUniversityService = oTempUniversityService;
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
            PageInfo<Universityresult> pageInfo = oiUniversityService.selectByCondition(pageNum, Context.PAGE_COUNT, null);

            //分离出分页器所带的数据集，以便JSP中的表格进行绑定
            model.addAttribute("DataList", pageInfo.getList());

            //赋值分页的链接地址，建议采用AJAX的分页链接地址（普通的请求地址如"/University/searchAll"）
            PageWriter<Universityresult> pageWriter = new PageWriter<Universityresult>(null, pageInfo);

            //生成分页器HTML
            pageWriter.generatePager();

            //将分页器的分页字符串返回前台JSP
            model.addAttribute("PageString", pageWriter.getPagerString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "/university/infomationmanagement/university/UniversityList";
    }

	/**
     * 根据条件查询具体模块，采用AJAX模式，通常用于局部刷新
     *
     * @return The URL of list page of University
     * @throws Exception
     */
    @RequestMapping(value = "/search")
    @ResponseBody
    public PageWriter<Universityresult> search(@RequestParam(required = true) Integer pageNum, @RequestParam(required = true) String degree, @RequestParam(required = true) String isDFG, @RequestParam(required = true) String isTOO, @RequestParam(required = true) String isNEF, @RequestParam(required = true) String description, @RequestParam(required = true) String universityName, @RequestParam(required = true) String provinceName) {
        PageWriter<Universityresult> pageWriter = null;
        try {
            //拼接查询条件Map
            Map<String, Object> condition = new HashMap<String, Object>();
			
//			condition.put("Password",password);
//			condition.put("Manager",manager);
			condition.put("Degree",degree);
			condition.put("IsDFG",isDFG);
			condition.put("IsTOO",isTOO);
			condition.put("IsNEF",isNEF);
			condition.put("Description",description);
			condition.put("UniversityName",universityName);
			condition.put("ProvinceName",provinceName);
			System.out.println(condition);

            PageInfo<Universityresult> pageInfo = oiUniversityService.selectByCondition(pageNum, Context.PAGE_COUNT, condition);

            //赋值分页的链接地址，建议采用AJAX的分页链接地址（下面被注解掉的是普通的请求地址）
            pageWriter = new PageWriter<Universityresult>(null, pageInfo);
            pageWriter.generatePager();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pageWriter;
    }
	
    /**
     * 添加页面跳转，在Spring中JSP要通过Controller访问另外的JSP
     *
     * @return The URL of add page of University
     * @throws Exception
     */
    @RequestMapping(value = "/addForward")
    public ModelAndView addForward() throws Exception {
        return new ModelAndView("/university/infomationmanagement/university/UniversityAdd");
    }

    @RequestMapping(value = "/addForward1")
    public String addForward1(Model model) throws Exception {
        List<Province> allProvince=oiUniversityService.selectallprovince();
        System.out.println(allProvince);
        List<Degree> alldegree=oiUniversityService.selectalldegree();
        System.out.println(alldegree);
        model.addAttribute("allProvince",allProvince);
        model.addAttribute("alldegree",alldegree);
        return "/university/infomationmanagement/university/UniversityAddall";
    }

    /**
     * 更新页面跳转
     *
     * @param testTableId
     * @return The URL of update page of University
     * @throws Exception
     */
    @RequestMapping(value = "/updateForward")
    public String updateForward(@RequestParam Integer testTableId,Model model) throws Exception {
        //根据ID查询出记录，再返回到修改页面
        Universityresult oUniversity = oiUniversityService.selectByID(testTableId);
        List<Province> allProvince=oiUniversityService.selectallprovince();
        List<Degree> alldegree=oiUniversityService.selectalldegree();
        model.addAttribute("University", oUniversity);
        model.addAttribute("allprovince",allProvince);
        model.addAttribute("alldegree",alldegree);
        return "/university/infomationmanagement/university/UniversityUpdateall";
    }
}
