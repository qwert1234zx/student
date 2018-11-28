package universityrecruit.student.jobsearch.studentquerycondition.entity;

/**
 * Created by dc on 2018/9/23.
 */
public class Industrycondition {
    private Integer IndustryConditionID;
    private Integer StudentQueryConditionID;
    private Integer IndustryID;

    public Integer getIndustryConditionID() {
        return IndustryConditionID;
    }

    public void setIndustryConditionID(Integer industryConditionID) {
        IndustryConditionID = industryConditionID;
    }

    public Integer getStudentQueryConditionID() {
        return StudentQueryConditionID;
    }

    public void setStudentQueryConditionID(Integer studentQueryConditionID) {
        StudentQueryConditionID = studentQueryConditionID;
    }

    public Integer getIndustryID() {
        return IndustryID;
    }

    public void setIndustryID(Integer industryID) {
        IndustryID = industryID;
    }

    @Override
    public String toString() {
        return "Industrycondition{" +
                "IndustryConditionID=" + IndustryConditionID +
                ", StudentQueryConditionID=" + StudentQueryConditionID +
                ", IndustryID=" + IndustryID +
                '}';
    }
}
