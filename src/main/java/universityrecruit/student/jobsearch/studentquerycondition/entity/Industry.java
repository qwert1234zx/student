package universityrecruit.student.jobsearch.studentquerycondition.entity;

/**
 * Created by dc on 2018/9/21.
 */
public class Industry {
    private Integer IndustryID;
    private String IndustryName;

    public Integer getIndustryID() {
        return IndustryID;
    }

    public void setIndustryID(Integer industryID) {
        IndustryID = industryID;
    }

    @Override
    public String toString() {
        return "Industry{" +
                "IndustryID=" + IndustryID +
                ", IndustryName='" + IndustryName + '\'' +
                '}';
    }

    public String getIndustryName() {
        return IndustryName;
    }

    public void setIndustryName(String industryName) {
        IndustryName = industryName;
    }
}
