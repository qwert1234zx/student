package universityrecruit.student.jobsearch.studentquerycondition.entity;

/**
 * Created by dc on 2018/9/24.
 */
public class Othercondition {
    private Integer OtherConditionID;
    private Integer StudentQueryConditionID;
    private Integer WorkYearLowerLimit;
    private Integer WorkYearUpperLimit;
    private Integer SalaryLowerLimit;
    private Integer SalaryUpperLimit;
    private Integer EmployeeNumberLowerLimit;
    private Integer EmployeeNumberUpperLimit;

    public Integer getOtherConditionID() {
        return OtherConditionID;
    }

    public void setOtherConditionID(Integer otherConditionID) {
        OtherConditionID = otherConditionID;
    }

    public Integer getStudentQueryConditionID() {
        return StudentQueryConditionID;
    }

    public void setStudentQueryConditionID(Integer studentQueryConditionID) {
        StudentQueryConditionID = studentQueryConditionID;
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

    public Integer getSalaryLowerLimit() {
        return SalaryLowerLimit;
    }

    public void setSalaryLowerLimit(Integer salaryLowerLimit) {
        SalaryLowerLimit = salaryLowerLimit;
    }

    public Integer getSalaryUpperLimit() {
        return SalaryUpperLimit;
    }

    public void setSalaryUpperLimit(Integer salaryUpperLimit) {
        SalaryUpperLimit = salaryUpperLimit;
    }

    public Integer getEmployeeNumberLowerLimit() {
        return EmployeeNumberLowerLimit;
    }

    public void setEmployeeNumberLowerLimit(Integer employeeNumberLowerLimit) {
        EmployeeNumberLowerLimit = employeeNumberLowerLimit;
    }

    public Integer getEmployeeNumberUpperLimit() {
        return EmployeeNumberUpperLimit;
    }

    public void setEmployeeNumberUpperLimit(Integer employeeNumberUpperLimit) {
        EmployeeNumberUpperLimit = employeeNumberUpperLimit;
    }

    @Override
    public String toString() {
        return "Othercondition{" +
                "OtherConditionID=" + OtherConditionID +
                ", StudentQueryConditionID=" + StudentQueryConditionID +
                ", WorkYearLowerLimit=" + WorkYearLowerLimit +
                ", WorkYearUpperLimit=" + WorkYearUpperLimit +
                ", SalaryLowerLimit=" + SalaryLowerLimit +
                ", SalaryUpperLimit=" + SalaryUpperLimit +
                ", EmployeeNumberLowerLimit=" + EmployeeNumberLowerLimit +
                ", EmployeeNumberUpperLimit=" + EmployeeNumberUpperLimit +
                '}';
    }
}
