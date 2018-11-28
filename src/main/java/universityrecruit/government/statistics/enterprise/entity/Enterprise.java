/**
 * The entity of Enterprise，该文件主要用于传递数据
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.government.statistics.enterprise.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("Enterprise")
public class Enterprise implements Serializable {

	private Integer EnterpriseID;
	private Integer Status;
	private String Password;
	private String Manager;
	private String Certification;
	private String BusinessRange;
	private String WebSite;
	private String IDNumber;
	private Integer IndustryID;
	private Integer ProvinceID;
	private String EnterpriseName;


	public Integer getEnterpriseID() { return EnterpriseID; } 
	public Integer getStatus() { return Status; } 
	public String getPassword() { return Password; } 
	public String getManager() { return Manager; } 
	public String getCertification() { return Certification; } 
	public String getBusinessRange() { return BusinessRange; } 
	public String getWebSite() { return WebSite; } 
	public String getIDNumber() { return IDNumber; } 
	public Integer getIndustryID() { return IndustryID; } 
	public Integer getProvinceID() { return ProvinceID; } 
	public String getEnterpriseName() { return EnterpriseName; } 


	public void setEnterpriseID( Integer pEnterpriseID ) { this.EnterpriseID = pEnterpriseID; } 
	public void setStatus( Integer pStatus ) { this.Status = pStatus; } 
	public void setPassword( String pPassword ) { this.Password = pPassword; } 
	public void setManager( String pManager ) { this.Manager = pManager; } 
	public void setCertification( String pCertification ) { this.Certification = pCertification; } 
	public void setBusinessRange( String pBusinessRange ) { this.BusinessRange = pBusinessRange; } 
	public void setWebSite( String pWebSite ) { this.WebSite = pWebSite; } 
	public void setIDNumber( String pIDNumber ) { this.IDNumber = pIDNumber; } 
	public void setIndustryID( Integer pIndustryID ) { this.IndustryID = pIndustryID; } 
	public void setProvinceID( Integer pProvinceID ) { this.ProvinceID = pProvinceID; } 
	public void setEnterpriseName( String pEnterpriseName ) { this.EnterpriseName = pEnterpriseName; } 


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", EnterpriseID=").append(EnterpriseID);
		sb.append(", Status=").append(Status);
		sb.append(", Password=").append(Password);
		sb.append(", Manager=").append(Manager);
		sb.append(", Certification=").append(Certification);
		sb.append(", BusinessRange=").append(BusinessRange);
		sb.append(", WebSite=").append(WebSite);
		sb.append(", IDNumber=").append(IDNumber);
		sb.append(", IndustryID=").append(IndustryID);
		sb.append(", ProvinceID=").append(ProvinceID);
		sb.append(", EnterpriseName=").append(EnterpriseName);
		sb.append("]");
		return sb.toString();
	}

}