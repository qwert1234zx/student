/**
 * The entity of Specialty，该文件主要用于传递数据
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.enterprise.statistics.specialty.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("Specialty")
public class Specialty implements Serializable {

	private Integer SpecialtyID;
	private String Description;
	private Integer Degree;
	private String SpecialityName;
	private Integer AcademyID;
	private Integer UniversityID;


	public Integer getSpecialtyID() { return SpecialtyID; } 
	public String getDescription() { return Description; } 
	public Integer getDegree() { return Degree; } 
	public String getSpecialityName() { return SpecialityName; } 
	public Integer getAcademyID() { return AcademyID; } 
	public Integer getUniversityID() { return UniversityID; } 


	public void setSpecialtyID( Integer pSpecialtyID ) { this.SpecialtyID = pSpecialtyID; } 
	public void setDescription( String pDescription ) { this.Description = pDescription; } 
	public void setDegree( Integer pDegree ) { this.Degree = pDegree; } 
	public void setSpecialityName( String pSpecialityName ) { this.SpecialityName = pSpecialityName; } 
	public void setAcademyID( Integer pAcademyID ) { this.AcademyID = pAcademyID; } 
	public void setUniversityID( Integer pUniversityID ) { this.UniversityID = pUniversityID; } 


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", SpecialtyID=").append(SpecialtyID);
		sb.append(", Description=").append(Description);
		sb.append(", Degree=").append(Degree);
		sb.append(", SpecialityName=").append(SpecialityName);
		sb.append(", AcademyID=").append(AcademyID);
		sb.append(", UniversityID=").append(UniversityID);
		sb.append("]");
		return sb.toString();
	}

}