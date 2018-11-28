package universityrecruit.student.jobsearch.studentquerycondition.entity;

/**
 * Created by dc on 2018/9/21.
 */
public class JobCategory {
    private Integer JobCategoryID;
    private String JobCategoryName;

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

    @Override
    public String toString() {
        return "JobCategory{" +
                "JobCategoryID=" + JobCategoryID +
                ", JobCategoryName='" + JobCategoryName + '\'' +
                '}';
    }
}
