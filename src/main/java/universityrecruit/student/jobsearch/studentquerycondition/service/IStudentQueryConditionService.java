/**
 * The service interface of StudentQueryCondition，该文件继承于IBaseService，其中insert、update、deleteByIdList、selectByID、selectByCondition可不用写
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.student.jobsearch.studentquerycondition.service;

import com.each.common.base.service.IBaseService;
import universityrecruit.student.jobsearch.studentquerycondition.entity.*;

import java.util.List;
import java.util.Map;

public interface IStudentQueryConditionService extends IBaseService<StudentQueryCondition> {

    public Integer addStudentquerycondition(StudentQueryCondition sqc);
    public Integer addenterpriseaddresscondition(List<Enterpriseaddresscondition> newenter);
    public Integer addenterpriseaddresscondition1(Map<String,Object> var,Integer stuqcid);
    public Integer addjobcategorycondition(Map<String,Object> var,Integer stuqcid);
    public Integer addindustrycondition(Map<String,Object> var,Integer stuqcid);
    public Integer addenterprisetypecondition(Map<String,Object> var,Integer stuqcid);
    public Integer addother(Map<String,Object> var,Integer stuqcid);
    public Integer addselectedsalarycondition(Addjobsearch ajs);
    public List<Province> selectProvince();
    public List<Industry> selectIndustry();
    public List<JobCategory> selectJobCategory();
    public List<EnterpriseType> selectEnterpriseType();
//    public Integer insertStudentquerycondition(Map<String, Object> var1);
//    public Integer insertenterpriseaddresscondition(Map<String, Object> var1);

    public Map<String,Object> preselectResults(Integer ids);
    public Map<String,Object> preselectResultsforwatch(Integer ids);
    public List<Results> selectResults(Map<String,Object> map);

    public Integer deleteall(Integer id);
//    public Integer updateall(Map<String,Object> map);
    public Integer updatestudentquerycondition(Map<String,Object> map);

    public Integer deleteByIdList1(List var1);

}
