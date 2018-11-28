package universityrecruit.student.jobsearch.studentquerycondition.entity;

/**
 * Created by dc on 2018/9/23.
 */
public class Jobcategorycondition {
    private Integer JobCategoryConditionID;
    private Integer StudentQueryConditionID;
    private Integer JobCategoryID;

    public Integer getJobCategoryConditionID() {
        return JobCategoryConditionID;
    }

    public void setJobCategoryConditionID(Integer jobCategoryConditionID) {
        JobCategoryConditionID = jobCategoryConditionID;
    }

    public Integer getStudentQueryConditionID() {
        return StudentQueryConditionID;
    }

    public void setStudentQueryConditionID(Integer studentQueryConditionID) {
        StudentQueryConditionID = studentQueryConditionID;
    }

    public Integer getJobCategoryID() {
        return JobCategoryID;
    }

    public void setJobCategoryID(Integer jobCategoryID) {
        JobCategoryID = jobCategoryID;
    }

    @Override
    public String toString() {
        return "Jobcategorycondition{" +
                "JobCategoryConditionID=" + JobCategoryConditionID +
                ", StudentQueryConditionID=" + StudentQueryConditionID +
                ", JobCategoryID=" + JobCategoryID +
                '}';
    }
}
