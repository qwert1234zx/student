package universityrecruit.student.statistics.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * Created by sw on 2018/9/14.
 */

@TableName("enterprise")
public class enterprise implements Serializable {

    private Integer enterpriseId;
    private String name;
    private Integer provinceID;
    private Integer industryID;
    private String idNumber;
    private String businessRange;
    private String certification;
    private String manager;
    private String password;
    private String webSite;
    private Integer status;

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getProvinceID() {
        return provinceID;
    }

    public void setProvinceID(Integer provinceID) {
        this.provinceID = provinceID;
    }

    public Integer getIndustryID() {
        return industryID;
    }

    public void setIndustryID(Integer industryID) {
        this.industryID = industryID;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getBusinessRange() {
        return businessRange;
    }

    public void setBusinessRange(String businessRange) {
        this.businessRange = businessRange;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "enterprise{" +
                "enterpriseId=" + enterpriseId +
                ", name='" + name + '\'' +
                ", provinceID=" + provinceID +
                ", industryID=" + industryID +
                ", idNumber='" + idNumber + '\'' +
                ", businessRange='" + businessRange + '\'' +
                ", certification='" + certification + '\'' +
                ", manager='" + manager + '\'' +
                ", password='" + password + '\'' +
                ", webSite='" + webSite + '\'' +
                ", status=" + status +
                '}';
    }
}

