/**
 * The service implements of StudentQueryCondition，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.student.jobsearch.studentquerycondition.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;
import universityrecruit.student.jobsearch.studentquerycondition.dao.StuJobStudentQueryConditionMapper;
import universityrecruit.student.jobsearch.studentquerycondition.entity.*;
import universityrecruit.student.jobsearch.studentquerycondition.service.IStudentQueryConditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("StuJobStudentQueryConditionService")
public class StuJobStudentQueryConditionServiceImpl extends BaseServiceImpl<StudentQueryCondition> implements IStudentQueryConditionService {

    private StuJobStudentQueryConditionMapper oStudentQueryConditionDao;

    @Autowired
    public StuJobStudentQueryConditionServiceImpl(StuJobStudentQueryConditionMapper oTempStudentQueryConditionDao){
        this.oStudentQueryConditionDao = oTempStudentQueryConditionDao;
        this.baseDao = oStudentQueryConditionDao;
    }
    public Integer addStudentquerycondition(StudentQueryCondition sqc){
        return oStudentQueryConditionDao.addStudentquerycondition(sqc);
    }
    public Integer addenterpriseaddresscondition(List<Enterpriseaddresscondition> newenter){
        return oStudentQueryConditionDao.addenterpriseaddresscondition(newenter);
    }
    public Integer addenterpriseaddresscondition1(Map<String,Object> var,Integer stuqcid){
        ArrayList<Integer> list1=(ArrayList<Integer>) var.get("Provinceid");
//        System.out.println("省份ids"+list1);
        if(list1==null||list1.size()==0){
            return 0;
        }
        List<Enterpriseaddresscondition> newenter=new ArrayList<Enterpriseaddresscondition>();
        for(int i=0;i<list1.size();i++){
            Enterpriseaddresscondition en=new Enterpriseaddresscondition();
            en.setStudentQueryConditionID(stuqcid);
            en.setProvinceID(Integer.parseInt(String.valueOf(list1.get(i))));//类型转换
            newenter.add(en);
        }
//        System.out.println("信心的"+newenter);
        return oStudentQueryConditionDao.addenterpriseaddresscondition(newenter);
    }
    public Integer addjobcategorycondition(Map<String,Object> var,Integer stuqcid){
        ArrayList<Integer> list1=(ArrayList<Integer>) var.get("JobCategoryid");
//        System.out.println("工作ids"+list1);
        if(list1==null||list1.size()==0){
            return 0;
        }
        List<Jobcategorycondition> newenter=new ArrayList<Jobcategorycondition>();
        for(int i=0;i<list1.size();i++){
            Jobcategorycondition en=new Jobcategorycondition();
            en.setStudentQueryConditionID(stuqcid);
            en.setJobCategoryID(Integer.parseInt(String.valueOf(list1.get(i))));//类型转换
            newenter.add(en);
        }
//        System.out.println("信心的"+newenter);
        return oStudentQueryConditionDao.addjobcategorycondition(newenter);
    }

    public Integer addindustrycondition(Map<String,Object> var,Integer stuqcid){
        ArrayList<Integer> list1=(ArrayList<Integer>) var.get("Industryid");
//        System.out.println("行业ids"+list1);
        if(list1==null||list1.size()==0){
            return 0;
        }
        List<Industrycondition> newenter=new ArrayList<Industrycondition>();
        for(int i=0;i<list1.size();i++){
            Industrycondition en=new Industrycondition();
            en.setStudentQueryConditionID(stuqcid);
            en.setIndustryID(Integer.parseInt(String.valueOf(list1.get(i))));//类型转换
            newenter.add(en);
        }
//        System.out.println("信心的"+newenter);
        return oStudentQueryConditionDao.addindustrycondition(newenter);
    }

    public Integer addenterprisetypecondition(Map<String,Object> var,Integer stuqcid){
        ArrayList<Integer> list1=(ArrayList<Integer>) var.get("EnterpriseTypeid");
//        System.out.println("公司性质ids"+list1);
        if(list1==null||list1.size()==0){
            return 0;
        }
        List<Enterprisetypecondition> newenter=new ArrayList<Enterprisetypecondition>();
        for(int i=0;i<list1.size();i++){
            Enterprisetypecondition en=new Enterprisetypecondition();
            en.setStudentQueryConditionID(stuqcid);
            en.setEnterpriseTypeID(Integer.parseInt(String.valueOf(list1.get(i))));//类型转换
            newenter.add(en);
        }
//        System.out.println("信心的"+newenter);
        return oStudentQueryConditionDao.addenterprisetypecondition(newenter);
    }

    public Integer addother(Map<String,Object> var,Integer stuqcid){
        Othercondition en=new Othercondition();
        en.setStudentQueryConditionID(stuqcid);
//        if(var.get("Ssalary")!=null||var.get("Bsalary")!=null||var.get("Syear")!=null||var.get("Byear")!=null){   //该判断出现问题

        if(var.get("Ssalary")!=null&&!var.get("Ssalary").equals(""))
            en.setSalaryLowerLimit(Integer.parseInt(String.valueOf(var.get("Ssalary"))));
        if(var.get("Bsalary")!=null&&!var.get("Bsalary").equals(""))
            en.setSalaryUpperLimit(Integer.parseInt(String.valueOf(var.get("Bsalary"))));
        if(var.get("Syear")!=null&&!var.get("Syear").equals(""))
            en.setWorkYearLowerLimit(Integer.parseInt(String.valueOf(var.get("Syear"))));
        if(var.get("Byear")!=null&&!var.get("Byear").equals(""))
            en.setWorkYearUpperLimit(Integer.parseInt(String.valueOf(var.get("Byear"))));
            return oStudentQueryConditionDao.addother(en);
//        }
//        else return 0;

    }

    public Integer addselectedsalarycondition(Addjobsearch ajs){
        return oStudentQueryConditionDao.addselectedsalarycondition(ajs);
    }
    public List<Province> selectProvince(){
        return oStudentQueryConditionDao.selectProvince();
    }
    public List<Industry> selectIndustry(){
        return oStudentQueryConditionDao.selectIndustry();
    }
    public List<JobCategory> selectJobCategory(){
        return oStudentQueryConditionDao.selectJobCategory();
    }
    public List<EnterpriseType> selectEnterpriseType(){
        return oStudentQueryConditionDao.selectEnterpriseType();
    }

    public Map<String,Object> preselectResults(Integer ids){
//        System.out.println("到达服务处"+ids);
        StudentQueryCondition sqc=oStudentQueryConditionDao.selectQueryCondition(ids);

        List<Integer> proid=oStudentQueryConditionDao.preselectprovince(ids);
//        System.out.println("绑定的省份id"+proid);
        List<Integer> jobid=oStudentQueryConditionDao.preselectjob(ids);
//        System.out.println("绑定的岗位id"+jobid);
        List<Integer> industryid=oStudentQueryConditionDao.preselectindustry(ids);
//        System.out.println("绑定的行业id"+industryid);
        List<Integer> entertypeid=oStudentQueryConditionDao.preselectentertype(ids);
//        System.out.println("绑定的公司类型id"+entertypeid);
        Othercondition othercondition=oStudentQueryConditionDao.preselectother(ids);
        Map<String,Object> map= new HashMap<String,Object>();
        map.put("sqc",sqc);
        map.put("proid",proid);
        map.put("jobid",jobid);
        map.put("industryid",industryid);
        map.put("entertypeid",entertypeid);
        map.put("othercondition",othercondition);//9-25新增其他条件
        return map;
    }

    public Map<String,Object> preselectResultsforwatch(Integer ids){
        StudentQueryCondition sqc=oStudentQueryConditionDao.selectQueryCondition(ids);
        List<Province> pro=oStudentQueryConditionDao.selectProvinceByid(ids);
        List<JobCategory> job=oStudentQueryConditionDao.selectJobCategoryByid(ids);
        List<Industry> industry=oStudentQueryConditionDao.selectIndustryByid(ids);
        List<EnterpriseType> etype=oStudentQueryConditionDao.selectEnterpriseTypeByid(ids);
        Othercondition othercondition=oStudentQueryConditionDao.preselectother(ids);
        Map<String,Object> map= new HashMap<String,Object>();
        map.put("sqc",sqc);
        map.put("pro",pro);
        map.put("job",job);
        map.put("industry",industry);
        map.put("etype",etype);
        map.put("othercondition",othercondition);
        return map;
    }

    public List<Results> selectResults(Map<String,Object> map){
        return oStudentQueryConditionDao.selectResults(map);
    }

    public Integer deleteall(Integer id){
        oStudentQueryConditionDao.deletepro(id);
        oStudentQueryConditionDao.deleteindust(id);
        oStudentQueryConditionDao.deletejob(id);
        oStudentQueryConditionDao.deletetype(id);
        oStudentQueryConditionDao.deleteother(id);
        return 1;
    }

    public Integer updatestudentquerycondition(Map<String,Object> map){
        return oStudentQueryConditionDao.updatestudentquerycondition(map);
    }

    public Integer deleteByIdList1(List var1) {

        oStudentQueryConditionDao.deleteproByList(var1);
        oStudentQueryConditionDao.deleteindustByList(var1);
        oStudentQueryConditionDao.deletejobByList(var1);
        oStudentQueryConditionDao.deletetypeByList(var1);
        oStudentQueryConditionDao.deleteotherByList(var1);
        oStudentQueryConditionDao.deleteByIdList(var1);
//        return 1;
//        Integer var2 = this.baseDao.deleteByIdList(var1);
        return 1;
    }


}
