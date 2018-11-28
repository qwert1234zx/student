/**
 * The entity of RequiredCourse，该文件主要用于传递数据
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.enterprise.statistics.requiredcourse.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("RequiredCourse")
public class RequiredCourse implements Serializable {

	private Integer RequiredCourseID;
	private Integer Grade;
	private String CourseName;
	private Integer DirectionID;
	private Integer SpecialityID;


	public Integer getRequiredCourseID() { return RequiredCourseID; } 
	public Integer getGrade() { return Grade; } 
	public String getCourseName() { return CourseName; } 
	public Integer getDirectionID() { return DirectionID; } 
	public Integer getSpecialityID() { return SpecialityID; } 


	public void setRequiredCourseID( Integer pRequiredCourseID ) { this.RequiredCourseID = pRequiredCourseID; } 
	public void setGrade( Integer pGrade ) { this.Grade = pGrade; } 
	public void setCourseName( String pCourseName ) { this.CourseName = pCourseName; } 
	public void setDirectionID( Integer pDirectionID ) { this.DirectionID = pDirectionID; } 
	public void setSpecialityID( Integer pSpecialityID ) { this.SpecialityID = pSpecialityID; } 


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", RequiredCourseID=").append(RequiredCourseID);
		sb.append(", Grade=").append(Grade);
		sb.append(", CourseName=").append(CourseName);
		sb.append(", DirectionID=").append(DirectionID);
		sb.append(", SpecialityID=").append(SpecialityID);
		sb.append("]");
		return sb.toString();
	}

}