/**
 * The controller of UniversityTypeCondition，该文件继承于BaseController，其中insert、update、deleteByIdList、selectByCondition可不用写
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.enterprise.studentsearch.universitytypecondition.controller;

import universityrecruit.enterprise.studentsearch.universitytypecondition.entity.UniversityTypeCondition;
import universityrecruit.enterprise.studentsearch.universitytypecondition.service.IUniversityTypeConditionService;
import common.context.Context;
import com.each.common.base.controller.BaseController;
import java.util.Date;
import com.each.common.base.page.PageWriter;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/enterprise/studentsearch/universitytypecondition")
public class EntStuUniversityTypeConditionController extends BaseController {

    @Resource(name = "EntStuUniversityTypeConditionService")
    private IUniversityTypeConditionService oiUniversityTypeConditionService;

    @Autowired
    public EntStuUniversityTypeConditionController(IUniversityTypeConditionService oTempUniversityTypeConditionService){
        this.baseService = oTempUniversityTypeConditionService;
        this.oiUniversityTypeConditionService = oTempUniversityTypeConditionService;
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
            PageInfo<UniversityTypeCondition> pageInfo = oiUniversityTypeConditionService.selectByCondition(pageNum, Context.PAGE_COUNT, null);

            //分离出分页器所带的数据集，以便JSP中的表格进行绑定
            model.addAttribute("DataList", pageInfo.getList());

            //赋值分页的链接地址，建议采用AJAX的分页链接地址（普通的请求地址如"/UniversityTypeCondition/searchAll"）
            PageWriter<UniversityTypeCondition> pageWriter = new PageWriter<UniversityTypeCondition>(null, pageInfo);

            //生成分页器HTML
            pageWriter.generatePager();

            //将分页器的分页字符串返回前台JSP
            model.addAttribute("PageString", pageWriter.getPagerString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "/enterprise/studentsearch/universitytypecondition/UniversityTypeConditionList";
    }

	/**
     * 根据条件查询具体模块，采用AJAX模式，通常用于局部刷新
     *
     * @return The URL of list page of UniversityTypeCondition
     * @throws Exception
     */
    @RequestMapping(value = "/search")
    @ResponseBody
    public PageWriter<UniversityTypeCondition> search(@RequestParam(required = true) Integer pageNum,  @RequestParam(required = true) Integer conditionValue, @RequestParam(required = true) Integer enterpriseQueryConditionID) {
        PageWriter<UniversityTypeCondition> pageWriter = null;
        try {
            //拼接查询条件Map
            Map<String, Object> condition = new HashMap<String, Object>();
			
			condition.put("ConditionValue",conditionValue);
			condition.put("EnterpriseQueryConditionID",enterpriseQueryConditionID);

            PageInfo<UniversityTypeCondition> pageInfo = oiUniversityTypeConditionService.selectByCondition(pageNum, Context.PAGE_COUNT, condition);

            //赋值分页的链接地址，建议采用AJAX的分页链接地址（下面被注解掉的是普通的请求地址）
            pageWriter = new PageWriter<UniversityTypeCondition>(null, pageInfo);
            pageWriter.generatePager();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pageWriter;
    }
	
    /**
     * 添加页面跳转，在Spring中JSP要通过Controller访问另外的JSP
     *
     * @return The URL of add page of UniversityTypeCondition
     * @throws Exception
     */
    @RequestMapping(value = "/addForward")
    public ModelAndView addForward() throws Exception {
        return new ModelAndView("/enterprise/studentsearch/universitytypecondition/UniversityTypeConditionAdd");
    }

    /**
     * 更新页面跳转
     *
     * @param testTableId
     * @return The URL of update page of UniversityTypeCondition
     * @throws Exception
     */
    @RequestMapping(value = "/updateForward")
    public ModelAndView updateForward(@RequestParam Integer testTableId) throws Exception {
        //根据ID查询出记录，再返回到修改页面
        UniversityTypeCondition oUniversityTypeCondition = oiUniversityTypeConditionService.selectByID(testTableId);
        return new ModelAndView("/enterprise/studentsearch/universitytypecondition/UniversityTypeConditionUpdate", "UniversityTypeCondition", oUniversityTypeCondition);
    }
}
