package universityrecruit.student.jobsearch.studentquerycondition.entity;

/**
 * Created by dc on 2018/9/23.
 */
public class Enterprisetypecondition {
    private Integer EnterpriseTypeConditionID;
    private Integer StudentQueryConditionID;
    private Integer EnterpriseTypeID;

    public Integer getEnterpriseTypeConditionID() {
        return EnterpriseTypeConditionID;
    }

    public void setEnterpriseTypeConditionID(Integer enterpriseTypeConditionID) {
        EnterpriseTypeConditionID = enterpriseTypeConditionID;
    }

    public Integer getStudentQueryConditionID() {
        return StudentQueryConditionID;
    }

    public void setStudentQueryConditionID(Integer studentQueryConditionID) {
        StudentQueryConditionID = studentQueryConditionID;
    }

    public Integer getEnterpriseTypeID() {
        return EnterpriseTypeID;
    }

    public void setEnterpriseTypeID(Integer enterpriseTypeID) {
        EnterpriseTypeID = enterpriseTypeID;
    }

    @Override
    public String toString() {
        return "Enterprisetypecondition{" +
                "EnterpriseTypeConditionID=" + EnterpriseTypeConditionID +
                ", StudentQueryConditionID=" + StudentQueryConditionID +
                ", EnterpriseTypeID=" + EnterpriseTypeID +
                '}';
    }
}
