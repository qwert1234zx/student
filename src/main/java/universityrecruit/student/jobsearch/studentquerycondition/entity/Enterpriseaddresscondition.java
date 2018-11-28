package universityrecruit.student.jobsearch.studentquerycondition.entity;

/**
 * Created by dc on 2018/9/23.
 */
public class Enterpriseaddresscondition {
    private Integer EnterpriseAddressConditionID;
    private Integer StudentQueryConditionID;
    private Integer ProvinceID;

    public Integer getEnterpriseAddressConditionID() {
        return EnterpriseAddressConditionID;
    }

    public void setEnterpriseAddressConditionID(Integer enterpriseAddressConditionID) {
        EnterpriseAddressConditionID = enterpriseAddressConditionID;
    }

    public Integer getStudentQueryConditionID() {
        return StudentQueryConditionID;
    }

    public void setStudentQueryConditionID(Integer studentQueryConditionID) {
        StudentQueryConditionID = studentQueryConditionID;
    }

    public Integer getProvinceID() {
        return ProvinceID;
    }

    public void setProvinceID(Integer provinceID) {
        ProvinceID = provinceID;
    }

    @Override
    public String toString() {
        return "Enterpriseaddresscondition{" +
                "EnterpriseAddressConditionID=" + EnterpriseAddressConditionID +
                ", StudentQueryConditionID=" + StudentQueryConditionID +
                ", ProvinceID=" + ProvinceID +
                '}';
    }
}
