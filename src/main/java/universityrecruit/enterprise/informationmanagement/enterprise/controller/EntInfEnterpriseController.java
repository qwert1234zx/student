/**
 * The controller of Enterprise，该文件继承于BaseController，其中insert、update、deleteByIdList、selectByCondition可不用写
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.enterprise.informationmanagement.enterprise.controller;

import universityrecruit.enterprise.informationmanagement.enterprise.entity.Enterprise;
import universityrecruit.enterprise.informationmanagement.enterprise.service.IEnterpriseService;
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
@RequestMapping(value = "/enterprise/informationmanagement/enterprise")
public class EntInfEnterpriseController extends BaseController {

    @Resource(name = "EntInfEnterpriseService")
    private IEnterpriseService oiEnterpriseService;

    @Autowired
    public EntInfEnterpriseController(IEnterpriseService oTempEnterpriseService){
        this.baseService = oTempEnterpriseService;
        this.oiEnterpriseService = oTempEnterpriseService;
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
            PageInfo<Enterprise> pageInfo = oiEnterpriseService.selectByCondition(pageNum, Context.PAGE_COUNT, null);

            //分离出分页器所带的数据集，以便JSP中的表格进行绑定
            model.addAttribute("DataList", pageInfo.getList());

            //赋值分页的链接地址，建议采用AJAX的分页链接地址（普通的请求地址如"/Enterprise/searchAll"）
            PageWriter<Enterprise> pageWriter = new PageWriter<Enterprise>(null, pageInfo);

            //生成分页器HTML
            pageWriter.generatePager();

            //将分页器的分页字符串返回前台JSP
            model.addAttribute("PageString", pageWriter.getPagerString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "/enterprise/informationmanagement/enterprise/EnterpriseList";
    }

	/**
     * 根据条件查询具体模块，采用AJAX模式，通常用于局部刷新
     *
     * @return The URL of list page of Enterprise
     * @throws Exception
     */
    @RequestMapping(value = "/search")
    @ResponseBody
    public PageWriter<Enterprise> search(@RequestParam(required = true) Integer pageNum,  @RequestParam(required = true) Integer status, @RequestParam(required = true) String password, @RequestParam(required = true) String manager, @RequestParam(required = true) String certification, @RequestParam(required = true) String businessRange, @RequestParam(required = true) String webSite, @RequestParam(required = true) String iDNumber, @RequestParam(required = true) Integer industryID, @RequestParam(required = true) Integer provinceID, @RequestParam(required = true) String enterpriseName) {
        PageWriter<Enterprise> pageWriter = null;
        try {
            //拼接查询条件Map
            Map<String, Object> condition = new HashMap<String, Object>();
			
			condition.put("Status",status);
			condition.put("Password",password);
			condition.put("Manager",manager);
			condition.put("Certification",certification);
			condition.put("BusinessRange",businessRange);
			condition.put("WebSite",webSite);
			condition.put("IDNumber",iDNumber);
			condition.put("IndustryID",industryID);
			condition.put("ProvinceID",provinceID);
			condition.put("EnterpriseName",enterpriseName);

            PageInfo<Enterprise> pageInfo = oiEnterpriseService.selectByCondition(pageNum, Context.PAGE_COUNT, condition);

            //赋值分页的链接地址，建议采用AJAX的分页链接地址（下面被注解掉的是普通的请求地址）
            pageWriter = new PageWriter<Enterprise>(null, pageInfo);
            pageWriter.generatePager();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pageWriter;
    }
	
    /**
     * 添加页面跳转，在Spring中JSP要通过Controller访问另外的JSP
     *
     * @return The URL of add page of Enterprise
     * @throws Exception
     */
    @RequestMapping(value = "/addForward")
    public ModelAndView addForward() throws Exception {
        return new ModelAndView("/enterprise/informationmanagement/enterprise/EnterpriseAdd");
    }

    /**
     * 更新页面跳转
     *
     * @param testTableId
     * @return The URL of update page of Enterprise
     * @throws Exception
     */
    @RequestMapping(value = "/updateForward")
    public ModelAndView updateForward(@RequestParam Integer testTableId) throws Exception {
        //根据ID查询出记录，再返回到修改页面
        Enterprise oEnterprise = oiEnterpriseService.selectByID(testTableId);
        return new ModelAndView("/enterprise/informationmanagement/enterprise/EnterpriseUpdate", "Enterprise", oEnterprise);
    }
}
