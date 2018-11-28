/**
 * The entity of StandardCourse，该文件主要用于传递数据
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.university.statistics.standardcourse.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("StandardCourse")
public class StandardCourse implements Serializable {

	private Integer StandardCourseID;
	private String CourseName;


	public Integer getStandardCourseID() { return StandardCourseID; } 
	public String getCourseName() { return CourseName; } 


	public void setStandardCourseID( Integer pStandardCourseID ) { this.StandardCourseID = pStandardCourseID; } 
	public void setCourseName( String pCourseName ) { this.CourseName = pCourseName; } 


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", StandardCourseID=").append(StandardCourseID);
		sb.append(", CourseName=").append(CourseName);
		sb.append("]");
		return sb.toString();
	}

}