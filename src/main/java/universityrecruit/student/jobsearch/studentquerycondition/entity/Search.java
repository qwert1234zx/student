package universityrecruit.student.jobsearch.studentquerycondition.entity;

/**
 * Created by dc on 2018/9/20.
 */
public class Search {
    private Integer Searchid;
    private Integer provinceid;
    private String provincename;
    private Integer IndustryID;
    private String IndustryName;
    private Integer JobCategoryID;
    private String JobCategoryName;
    private Integer EnterpriseTypeID;
    private String EnterpriseTypeName;

    public Integer getSearchid() {
        return Searchid;
    }

    public void setSearchid(Integer searchid) {
        Searchid = searchid;
    }

    @Override
    public String toString() {
        return "Search{" +
                "Searchid=" + Searchid +
                ", provinceid=" + provinceid +
                ", provincename='" + provincename + '\'' +
                ", IndustryID=" + IndustryID +
                ", IndustryName='" + IndustryName + '\'' +
                ", JobCategoryID=" + JobCategoryID +
                ", JobCategoryName='" + JobCategoryName + '\'' +
                ", EnterpriseTypeID=" + EnterpriseTypeID +
                ", EnterpriseTypeName='" + EnterpriseTypeName + '\'' +
                '}';
    }

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    public String getProvincename() {
        return provincename;
    }

    public void setProvincename(String provincename) {
        this.provincename = provincename;
    }

    public Integer getIndustryID() {
        return IndustryID;
    }

    public void setIndustryID(Integer industryID) {
        IndustryID = industryID;
    }

    public String getIndustryName() {
        return IndustryName;
    }

    public void setIndustryName(String industryName) {
        IndustryName = industryName;
    }

    public Integer getJobCategoryID() {
        return JobCategoryID;
    }

    public void setJobCategoryID(Integer jobCategoryID) {
        JobCategoryID = jobCategoryID;
    }

    public String getJobCategoryName() {
        return JobCategoryName;
    }

    public void setJobCategoryName(String jobCategoryName) {
        JobCategoryName = jobCategoryName;
    }

    public Integer getEnterpriseTypeID() {
        return EnterpriseTypeID;
    }

    public void setEnterpriseTypeID(Integer enterpriseTypeID) {
        EnterpriseTypeID = enterpriseTypeID;
    }

    public String getEnterpriseTypeName() {
        return EnterpriseTypeName;
    }

    public void setEnterpriseTypeName(String enterpriseTypeName) {
        EnterpriseTypeName = enterpriseTypeName;
    }




}
