package universityrecruit.university.infomationmanagement.university.entity;

/**
 * Created by dc on 2018/9/27.
 */
public class Degree {
    private Integer DegreeID;
    private String DegreeName;

    public Integer getDegreeID() {
        return DegreeID;
    }

    public void setDegreeID(Integer degreeID) {
        DegreeID = degreeID;
    }

    public String getDegreeName() {
        return DegreeName;
    }

    public void setDegreeName(String degreeName) {
        DegreeName = degreeName;
    }

    @Override
    public String toString() {
        return "Degree{" +
                "DegreeID=" + DegreeID +
                ", DegreeName='" + DegreeName + '\'' +
                '}';
    }
}
