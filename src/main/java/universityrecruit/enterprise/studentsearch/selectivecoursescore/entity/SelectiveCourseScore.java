/**
 * The entity of SelectiveCourseScore，该文件主要用于传递数据
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.enterprise.studentsearch.selectivecoursescore.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("SelectiveCourseScore")
public class SelectiveCourseScore implements Serializable {

	private Integer SelectiveCourseScoreID;
	private Float Score;
	private Integer StudentID;
	private String CourseName;


	public Integer getSelectiveCourseScoreID() { return SelectiveCourseScoreID; } 
	public Float getScore() { return Score; } 
	public Integer getStudentID() { return StudentID; } 
	public String getCourseName() { return CourseName; } 


	public void setSelectiveCourseScoreID( Integer pSelectiveCourseScoreID ) { this.SelectiveCourseScoreID = pSelectiveCourseScoreID; } 
	public void setScore( Float pScore ) { this.Score = pScore; } 
	public void setStudentID( Integer pStudentID ) { this.StudentID = pStudentID; } 
	public void setCourseName( String pCourseName ) { this.CourseName = pCourseName; } 


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", SelectiveCourseScoreID=").append(SelectiveCourseScoreID);
		sb.append(", Score=").append(Score);
		sb.append(", StudentID=").append(StudentID);
		sb.append(", CourseName=").append(CourseName);
		sb.append("]");
		return sb.toString();
	}

}