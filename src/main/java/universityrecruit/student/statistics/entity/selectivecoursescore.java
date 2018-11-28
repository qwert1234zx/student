package universityrecruit.student.statistics.entity;

/**
 * Created by sw on 2018/9/14.
 */
public class selectivecoursescore {
    private Integer selectivecoursescoreid;
    private String name;
    private Integer studentid;
    private Float score;

    public Integer getSelectivecoursescoreid() {
        return selectivecoursescoreid;
    }

    public void setSelectivecoursescoreid(Integer selectivecoursescoreid) {
        this.selectivecoursescoreid = selectivecoursescoreid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "selectivecoursescore{" +
                "selectivecoursescoreid=" + selectivecoursescoreid +
                ", name='" + name + '\'' +
                ", studentid=" + studentid +
                ", score=" + score +
                '}';
    }
}
