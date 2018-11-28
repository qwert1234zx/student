package universityrecruit.student.statistics.entity;

/**
 * Created by sw on 2018/9/20.
 */
public class requiredcourse {
    private Integer requiredCourseID;
    private Integer specialityID;
    private Integer directionID;
    private String courseName;
    private Integer gradee;

    public Integer getRequiredCourseID() {
        return requiredCourseID;
    }

    public void setRequiredCourseID(Integer requiredCourseID) {
        this.requiredCourseID = requiredCourseID;
    }

    public Integer getSpecialityID() {
        return specialityID;
    }

    public void setSpecialityID(Integer specialityID) {
        this.specialityID = specialityID;
    }

    public Integer getDirectionID() {
        return directionID;
    }

    public void setDirectionID(Integer directionID) {
        this.directionID = directionID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getGradee() {
        return gradee;
    }

    public void setGradee(Integer gradee) {
        this.gradee = gradee;
    }
}
