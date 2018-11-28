/**
 * The entity of CourseRelationship，该文件主要用于传递数据
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.university.coursemanagement.courserelationship.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("CourseRelationship")
public class CourseRelationship implements Serializable {

	private Integer CourseRelationshipID;
	private Integer StandardCourseID;
	private Integer RequiredCourseID;


	public Integer getCourseRelationshipID() { return CourseRelationshipID; } 
	public Integer getStandardCourseID() { return StandardCourseID; } 
	public Integer getRequiredCourseID() { return RequiredCourseID; } 


	public void setCourseRelationshipID( Integer pCourseRelationshipID ) { this.CourseRelationshipID = pCourseRelationshipID; } 
	public void setStandardCourseID( Integer pStandardCourseID ) { this.StandardCourseID = pStandardCourseID; } 
	public void setRequiredCourseID( Integer pRequiredCourseID ) { this.RequiredCourseID = pRequiredCourseID; } 


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", CourseRelationshipID=").append(CourseRelationshipID);
		sb.append(", StandardCourseID=").append(StandardCourseID);
		sb.append(", RequiredCourseID=").append(RequiredCourseID);
		sb.append("]");
		return sb.toString();
	}

}