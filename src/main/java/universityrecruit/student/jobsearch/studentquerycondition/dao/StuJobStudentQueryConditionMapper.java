/**
 * The dao of StudentQueryCondition，该文件继承于BaseMapper，基本的CURD方法采用基类中的方法，若无必要可不用重写
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.student.jobsearch.studentquerycondition.dao;

import com.each.common.base.dao.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import universityrecruit.student.jobsearch.studentquerycondition.entity.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface StuJobStudentQueryConditionMapper extends BaseMapper<StudentQueryCondition>{

    public Integer addStudentquerycondition(StudentQueryCondition sqc);
    public Integer addenterpriseaddresscondition(List<Enterpriseaddresscondition> newenter);
    public Integer addjobcategorycondition(List<Jobcategorycondition> newenter);
    public Integer addindustrycondition(List<Industrycondition> newenter);
    public Integer addenterprisetypecondition(List<Enterprisetypecondition> newenter);
    public Integer addother(Othercondition other);

    public Integer addselectedsalarycondition(Addjobsearch ajs);
//    public Integer insertStudentquerycondition(Map<String, Object> var1);
//    public Integer insertenterpriseaddresscondition(Map<String, Object> var1);


    public List<Province> selectProvince();
    public List<Industry> selectIndustry();
    public List<JobCategory> selectJobCategory();
    public List<EnterpriseType> selectEnterpriseType();
    public StudentQueryCondition selectQueryCondition(@Param("id") Integer id);

    public List<Province> selectProvinceByid(@Param("id") Integer id);
    public List<JobCategory> selectJobCategoryByid(@Param("id") Integer id);
    public List<Industry> selectIndustryByid(@Param("id") Integer id);
    public List<EnterpriseType> selectEnterpriseTypeByid(@Param("id") Integer id);



    //最终结果集
    public List<Integer> preselectResults(Integer ids);
    public List<Integer> preselectprovince(@Param("ids") Integer ids);//绑定省份id
    public List<Integer> preselectjob(@Param("ids") Integer ids); //绑定岗位id
    public List<Integer> preselectindustry(@Param("ids")Integer ids);//绑定行业id
    public List<Integer> preselectentertype(@Param("ids") Integer ids);//绑定公司性质id
    public Othercondition preselectother(@Param("ids") Integer ids);//绑定其他条件
    public List<Results> selectResults(Map<String,Object> map);

    public void deletepro(Integer id);
    public void deleteindust(Integer id);
    public void deletejob(Integer id);
    public void deletetype(Integer id);
    public void deleteother(Integer id);

    public Integer updatestudentquerycondition(Map<String,Object> map);

    public void deleteproByList(List var1);
    public void deleteindustByList(List var1);
    public void deletejobByList(List var1);
    public void deletetypeByList(List var1);
    public void deleteotherByList(List var1);

}