package universityrecruit.student.jobsearch.studentquerycondition.entity;

/**
 * Created by dc on 2018/9/24.
 */
public class Results {
    private Integer resultid;
    private String EnterpriseName;
    private Integer JobCategoryID;
    private String JobName;
    private Integer IndustryID;
    private String IndustryName;
    private Integer EnterpriseTypeID;
    private String EnterpriseTypeName;
    private Integer ProvinceID;
    private String ProvinceName;
    private Integer LowerSalary;
    private Integer UpperSalary;
    private Integer WorkYearLowerLimit;
    private Integer WorkYearUpperLimit;

    public Integer getResultid() {
        return resultid;
    }

    public void setResultid(Integer resultid) {
        this.resultid = resultid;
    }

    public String getEnterpriseName() {
        return EnterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        EnterpriseName = enterpriseName;
    }

    public String getJobName() {
        return JobName;
    }

    public void setJobName(String jobName) {
        JobName = jobName;
    }

    public String getIndustryName() {
        return IndustryName;
    }

    public void setIndustryName(String industryName) {
        IndustryName = industryName;
    }

    public String getEnterpriseTypeName() {
        return EnterpriseTypeName;
    }

    public void setEnterpriseTypeName(String enterpriseTypeName) {
        EnterpriseTypeName = enterpriseTypeName;
    }

    public String getProvinceName() {
        return ProvinceName;
    }

    public void setProvinceName(String provinceName) {
        ProvinceName = provinceName;
    }

    public Integer getLowerSalary() {
        return LowerSalary;
    }

    public void setLowerSalary(Integer lowerSalary) {
        LowerSalary = lowerSalary;
    }

    public Integer getUpperSalary() {
        return UpperSalary;
    }

    public void setUpperSalary(Integer upperSalary) {
        UpperSalary = upperSalary;
    }

    public Integer getWorkYearLowerLimit() {
        return WorkYearLowerLimit;
    }

    public void setWorkYearLowerLimit(Integer workYearLowerLimit) {
        WorkYearLowerLimit = workYearLowerLimit;
    }

    public Integer getWorkYearUpperLimit() {
        return WorkYearUpperLimit;
    }

    public void setWorkYearUpperLimit(Integer workYearUpperLimit) {
        WorkYearUpperLimit = workYearUpperLimit;
    }

    public Integer getJobCategoryID() {
        return JobCategoryID;
    }

    public void setJobCategoryID(Integer jobCategoryID) {
        JobCategoryID = jobCategoryID;
    }

    public Integer getIndustryID() {
        return IndustryID;
    }

    public void setIndustryID(Integer industryID) {
        IndustryID = industryID;
    }

    public Integer getEnterpriseTypeID() {
        return EnterpriseTypeID;
    }

    public void setEnterpriseTypeID(Integer enterpriseTypeID) {
        EnterpriseTypeID = enterpriseTypeID;
    }

    public Integer getProvinceID() {
        return ProvinceID;
    }

    public void setProvinceID(Integer provinceID) {
        ProvinceID = provinceID;
    }

    @Override
    public String toString() {
        return "Results{" +
                "resultid=" + resultid +
                ", EnterpriseName='" + EnterpriseName + '\'' +
                ", JobCategoryID=" + JobCategoryID +
                ", JobName='" + JobName + '\'' +
                ", IndustryID=" + IndustryID +
                ", IndustryName='" + IndustryName + '\'' +
                ", EnterpriseTypeID=" + EnterpriseTypeID +
                ", EnterpriseTypeName='" + EnterpriseTypeName + '\'' +
                ", ProvinceID=" + ProvinceID +
                ", ProvinceName='" + ProvinceName + '\'' +
                ", LowerSalary=" + LowerSalary +
                ", UpperSalary=" + UpperSalary +
                ", WorkYearLowerLimit=" + WorkYearLowerLimit +
                ", WorkYearUpperLimit=" + WorkYearUpperLimit +
                '}';
    }
}
