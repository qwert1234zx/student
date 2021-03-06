package universityrecruit.student.statistics.entity;


import com.baomidou.mybatisplus.annotations.TableName;

@TableName("requiredcoursescore")
public class NewStudent {

    private Integer requiredcoursescore;
    private Integer requiredcourselid;
    private Integer studentid;
    private Float score;
    private String courseName;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


    public Integer getRequiredcoursescore() {
        return requiredcoursescore;
    }

    public void setRequiredcoursescore(Integer requiredcoursescore) {
        this.requiredcoursescore = requiredcoursescore;
    }

    public Integer getRequiredcourselid() {
        return requiredcourselid;
    }

    public void setRequiredcourselid(Integer requiredcourselid) {
        this.requiredcourselid = requiredcourselid;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }
}
