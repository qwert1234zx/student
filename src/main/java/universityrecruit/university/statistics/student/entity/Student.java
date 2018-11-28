/**
 * The entity of Student，该文件主要用于传递数据
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.university.statistics.student.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("Student")
public class Student implements Serializable {

	private Integer StudentID;
	private String Password;
	private String Mobile;
	private String IDNumber;
	private String StudentNo;
	private Integer GraduationYear;
	private Integer Grade;
	private Integer Sex;
	private Integer ProvinceID;
	private String StudentName;
	private Integer DirectionID;
	private Integer SpecialityID;
	private Integer AcademyID;
	private Integer UniversityID;


	public Integer getStudentID() { return StudentID; } 
	public String getPassword() { return Password; } 
	public String getMobile() { return Mobile; } 
	public String getIDNumber() { return IDNumber; } 
	public String getStudentNo() { return StudentNo; } 
	public Integer getGraduationYear() { return GraduationYear; } 
	public Integer getGrade() { return Grade; } 
	public Integer getSex() { return Sex; } 
	public Integer getProvinceID() { return ProvinceID; } 
	public String getStudentName() { return StudentName; } 
	public Integer getDirectionID() { return DirectionID; } 
	public Integer getSpecialityID() { return SpecialityID; } 
	public Integer getAcademyID() { return AcademyID; } 
	public Integer getUniversityID() { return UniversityID; } 


	public void setStudentID( Integer pStudentID ) { this.StudentID = pStudentID; } 
	public void setPassword( String pPassword ) { this.Password = pPassword; } 
	public void setMobile( String pMobile ) { this.Mobile = pMobile; } 
	public void setIDNumber( String pIDNumber ) { this.IDNumber = pIDNumber; } 
	public void setStudentNo( String pStudentNo ) { this.StudentNo = pStudentNo; } 
	public void setGraduationYear( Integer pGraduationYear ) { this.GraduationYear = pGraduationYear; } 
	public void setGrade( Integer pGrade ) { this.Grade = pGrade; } 
	public void setSex( Integer pSex ) { this.Sex = pSex; } 
	public void setProvinceID( Integer pProvinceID ) { this.ProvinceID = pProvinceID; } 
	public void setStudentName( String pStudentName ) { this.StudentName = pStudentName; } 
	public void setDirectionID( Integer pDirectionID ) { this.DirectionID = pDirectionID; } 
	public void setSpecialityID( Integer pSpecialityID ) { this.SpecialityID = pSpecialityID; } 
	public void setAcademyID( Integer pAcademyID ) { this.AcademyID = pAcademyID; } 
	public void setUniversityID( Integer pUniversityID ) { this.UniversityID = pUniversityID; } 


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", StudentID=").append(StudentID);
		sb.append(", Password=").append(Password);
		sb.append(", Mobile=").append(Mobile);
		sb.append(", IDNumber=").append(IDNumber);
		sb.append(", StudentNo=").append(StudentNo);
		sb.append(", GraduationYear=").append(GraduationYear);
		sb.append(", Grade=").append(Grade);
		sb.append(", Sex=").append(Sex);
		sb.append(", ProvinceID=").append(ProvinceID);
		sb.append(", StudentName=").append(StudentName);
		sb.append(", DirectionID=").append(DirectionID);
		sb.append(", SpecialityID=").append(SpecialityID);
		sb.append(", AcademyID=").append(AcademyID);
		sb.append(", UniversityID=").append(UniversityID);
		sb.append("]");
		return sb.toString();
	}

}