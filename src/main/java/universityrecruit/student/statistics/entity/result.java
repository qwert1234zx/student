package universityrecruit.student.statistics.entity;

/**
 * Created by sw on 2018/9/15.
 */
public class result {
    public Float score;
    public String courseName;

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public result(String courseName, Float score) {
        this.score = score;
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "result{" +
                "score=" + score +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
