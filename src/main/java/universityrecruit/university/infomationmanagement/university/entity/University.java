/**
 * The entity of University，该文件主要用于传递数据
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.university.infomationmanagement.university.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("University")
public class University implements Serializable {

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


	public Integer getUniversityID() { return UniversityID; } 
	public String getPassword() { return Password; } 
	public String getManager() { return Manager; } 
	public Integer getDegree() { return Degree; } 
	public String getIsDFG() { return IsDFG; } 
	public String getIsTOO() { return IsTOO; } 
	public String getIsNEF() { return IsNEF; } 
	public String getDescription() { return Description; } 
	public String getUniversityName() { return UniversityName; } 
	public Integer getProvinceID() { return ProvinceID; } 


	public void setUniversityID( Integer pUniversityID ) { this.UniversityID = pUniversityID; } 
	public void setPassword( String pPassword ) { this.Password = pPassword; } 
	public void setManager( String pManager ) { this.Manager = pManager; } 
	public void setDegree( Integer pDegree ) { this.Degree = pDegree; } 
	public void setIsDFG( String pIsDFG ) { this.IsDFG = pIsDFG; } 
	public void setIsTOO( String pIsTOO ) { this.IsTOO = pIsTOO; } 
	public void setIsNEF( String pIsNEF ) { this.IsNEF = pIsNEF; } 
	public void setDescription( String pDescription ) { this.Description = pDescription; } 
	public void setUniversityName( String pUniversityName ) { this.UniversityName = pUniversityName; } 
	public void setProvinceID( Integer pProvinceID ) { this.ProvinceID = pProvinceID; } 


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", UniversityID=").append(UniversityID);
		sb.append(", Password=").append(Password);
		sb.append(", Manager=").append(Manager);
		sb.append(", Degree=").append(Degree);
		sb.append(", IsDFG=").append(IsDFG);
		sb.append(", IsTOO=").append(IsTOO);
		sb.append(", IsNEF=").append(IsNEF);
		sb.append(", Description=").append(Description);
		sb.append(", UniversityName=").append(UniversityName);
		sb.append(", ProvinceID=").append(ProvinceID);
		sb.append("]");
		return sb.toString();
	}

}