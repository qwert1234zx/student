package universityrecruit.university.infomationmanagement.university.entity;

import java.io.Serializable;

/**
 * Created by dc on 2018/9/27.
 */
public class Universityresult implements Serializable {
    private Integer UniversityID;
    private String Password;
    private String Manager;
    private Integer Degree;
    private String IsDFG;
    private String IsTOO;
    private String IsNEF;
    private String Description;
    private String UniversityName;
    private Integer ProvinceID;
    private String ProvinceName;
    private String DegreeName;

    public Integer getUniversityID() {
        return UniversityID;
    }

    public void setUniversityID(Integer universityID) {
        UniversityID = universityID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getManager() {
        return Manager;
    }

    public void setManager(String manager) {
        Manager = manager;
    }

    public Integer getDegree() {
        return Degree;
    }

    public void setDegree(Integer degree) {
        Degree = degree;
    }

    public String getIsDFG() {
        return IsDFG;
    }

    public void setIsDFG(String isDFG) {
        IsDFG = isDFG;
    }

    public String getIsTOO() {
        return IsTOO;
    }

    public void setIsTOO(String isTOO) {
        IsTOO = isTOO;
    }

    public String getIsNEF() {
        return IsNEF;
    }

    public void setIsNEF(String isNEF) {
        IsNEF = isNEF;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getUniversityName() {
        return UniversityName;
    }

    public void setUniversityName(String universityName) {
        UniversityName = universityName;
    }

    public Integer getProvinceID() {
        return ProvinceID;
    }

    public void setProvinceID(Integer provinceID) {
        ProvinceID = provinceID;
    }

    public String getProvinceName() {
        return ProvinceName;
    }

    public void setProvinceName(String provinceName) {
        ProvinceName = provinceName;
    }

    public String getDegreeName() {
        return DegreeName;
    }

    public void setDegreeName(String degreeName) {
        DegreeName = degreeName;
    }

    @Override
    public String toString() {
        return "Universityresult{" +
                "UniversityID=" + UniversityID +
                ", Password='" + Password + '\'' +
                ", Manager='" + Manager + '\'' +
                ", Degree=" + Degree +
                ", IsDFG='" + IsDFG + '\'' +
                ", IsTOO='" + IsTOO + '\'' +
                ", IsNEF='" + IsNEF + '\'' +
                ", Description='" + Description + '\'' +
                ", UniversityName='" + UniversityName + '\'' +
                ", ProvinceID=" + ProvinceID +
                ", ProvinceName='" + ProvinceName + '\'' +
                ", DegreeName='" + DegreeName + '\'' +
                '}';
    }
}
