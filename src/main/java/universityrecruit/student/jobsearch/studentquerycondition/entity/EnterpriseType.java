package universityrecruit.student.jobsearch.studentquerycondition.entity;

/**
 * Created by dc on 2018/9/21.
 */
public class EnterpriseType {
    private Integer EnterpriseTypeID;
    private String EnterpriseTypeName;

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

    @Override
    public String toString() {
        return "EnterpriseType{" +
                "EnterpriseTypeID=" + EnterpriseTypeID +
                ", EnterpriseTypeName='" + EnterpriseTypeName + '\'' +
                '}';
    }
}
