/**
 * The entity of Academy，该文件主要用于传递数据
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.university.statistics.academy.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("Academy")
public class Academy implements Serializable {

	private Integer AcademyID;
	private String Description;
	private String AcademyName;
	private Integer UniversityID;


	public Integer getAcademyID() { return AcademyID; } 
	public String getDescription() { return Description; } 
	public String getAcademyName() { return AcademyName; } 
	public Integer getUniversityID() { return UniversityID; } 


	public void setAcademyID( Integer pAcademyID ) { this.AcademyID = pAcademyID; } 
	public void setDescription( String pDescription ) { this.Description = pDescription; } 
	public void setAcademyName( String pAcademyName ) { this.AcademyName = pAcademyName; } 
	public void setUniversityID( Integer pUniversityID ) { this.UniversityID = pUniversityID; } 


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", AcademyID=").append(AcademyID);
		sb.append(", Description=").append(Description);
		sb.append(", AcademyName=").append(AcademyName);
		sb.append(", UniversityID=").append(UniversityID);
		sb.append("]");
		return sb.toString();
	}

}