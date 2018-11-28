/**
 * The entity of RequiredCourseScore，该文件主要用于传递数据
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.university.statistics.requiredcoursescore.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("RequiredCourseScore")
public class RequiredCourseScore implements Serializable {

	private Integer RequiredCourseScoreID;
	private Float Score;
	private Integer StudentID;
	private Integer RequiredCourseID;


	public Integer getRequiredCourseScoreID() { return RequiredCourseScoreID; } 
	public Float getScore() { return Score; } 
	public Integer getStudentID() { return StudentID; } 
	public Integer getRequiredCourseID() { return RequiredCourseID; } 


	public void setRequiredCourseScoreID( Integer pRequiredCourseScoreID ) { this.RequiredCourseScoreID = pRequiredCourseScoreID; } 
	public void setScore( Float pScore ) { this.Score = pScore; } 
	public void setStudentID( Integer pStudentID ) { this.StudentID = pStudentID; } 
	public void setRequiredCourseID( Integer pRequiredCourseID ) { this.RequiredCourseID = pRequiredCourseID; } 


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", RequiredCourseScoreID=").append(RequiredCourseScoreID);
		sb.append(", Score=").append(Score);
		sb.append(", StudentID=").append(StudentID);
		sb.append(", RequiredCourseID=").append(RequiredCourseID);
		sb.append("]");
		return sb.toString();
	}

}