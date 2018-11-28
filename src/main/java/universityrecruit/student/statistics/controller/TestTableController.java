/**
 * The controller of TestTable，该文件继承于BaseController，其中insert、update、deleteByIdList、selectByCondition可不用写
 * Created 2018/6/5
 * @author Howard Chung
 */
package universityrecruit.student.statistics.controller;

//import com.each.common.inner.controller.InnerBaseController;

import com.each.common.base.controller.BaseController;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import universityrecruit.student.statistics.entity.TestTable;
import universityrecruit.student.statistics.entity.sorceResult;
import universityrecruit.student.statistics.entity.sorceResult1;
import universityrecruit.student.statistics.impl.ITestTableService;
import universityrecruit.student.statistics.impl.NewStudentInfoService;
import universityrecruit.student.statistics.impl.studenttjservice;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/system/testdiagram/testtable")
public class TestTableController extends BaseController {
    //生成日志对象
    protected final static org.slf4j.Logger logger = LoggerFactory.getLogger(TestTableController.class);

    @Resource(name = "TestTableService")
    private ITestTableService oiTestTableService;

    @RequestMapping(value = "/search")
    @ResponseBody
    public TestTable search(@RequestParam(required = true) String start1, @RequestParam(required = true) String end1) {
        TestTable result = new TestTable();
        try {
            //拼接查询条件Map
            Map<String, Object> condition = new HashMap<String, Object>();
            condition.put("start1",start1);
            condition.put("end1",end1);

            result = oiTestTableService.selectByCondition(condition);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Autowired
    private NewStudentInfoService newStudentInfoService;
    @Autowired
    private studenttjservice studenttjservice;
    //首页柱状图
//    @RequestMapping(value = "/hello")
//    @ResponseBody
//    public List<sorceResult> page() {
//        //list获取sql数据
//        List<sorceResult> sorceResult = newStudentInfoService.getAllStudent();
//        /*System.out.println("hello页面请求数据:" + newStudents.size());
//        System.out.println("柱状图请求数据:" +newStudents.toString());*/
//        return sorceResult;
//    }

/*    @RequestMapping(value = "/myecharts")
    @ResponseBody
    public List<Float> getScore() {
        List<NewStudent> newStudents = newStudentInfoService.getAllStudent();
        List<Float> scores = null;
        for (NewStudent newStudent : newStudents) {
            scores.add(newStudent.getScore());
        }
        System.out.println("饼图请求数据:" +scores.toString());
        return scores;
    }*/

    @RequestMapping(value = "/myeCharts")
    public String myeCharts() {
        return "/student/statistics/myecharts";
    }

    @RequestMapping(value = "/getPieCharts")
    public String getPieCharts() {
        return "/student/statistics/PieCharts";
    }
    @RequestMapping(value = "/testtable")
    public String testtable() {
        return "/student/statistics/TestTableList";
    }


    @RequestMapping(value = "/getData")
    @ResponseBody
    public List<sorceResult> getData() {

        List<sorceResult> students = newStudentInfoService.getAllStudent();

        List<sorceResult> results = new ArrayList<sorceResult>();
        for (sorceResult sorceResult : students) {

            // 把学生的成绩和课程名封装到一个result
            sorceResult result = new sorceResult( sorceResult.getCourseName(),sorceResult.getScore());

            results.add(result);
        }
        System.out.println("json数据:"+results);
        return results;
    }
    @RequestMapping(value = "/getdataa")
    @ResponseBody
    public List<sorceResult1> getdata() {

        List<sorceResult1> students = studenttjservice.getAllqy();

        List<sorceResult1> results = new ArrayList<sorceResult1>();
        for (sorceResult1 sorceResult1 : students) {

            // 把学生的成绩和课程名封装到一个result
            sorceResult1 result = new sorceResult1( sorceResult1.getIndustryName(),sorceResult1.getIndlnviSum());

            results.add(result);
        }
        System.out.println("json数据:"+results);
        return results;
    }





}
