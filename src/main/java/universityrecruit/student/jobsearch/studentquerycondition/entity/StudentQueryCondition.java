/**
 * The entity of StudentQueryCondition，该文件主要用于传递数据
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.student.jobsearch.studentquerycondition.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("StudentQueryCondition")
public class StudentQueryCondition implements Serializable {

	private Integer StudentQueryCondition;
	private String QueryName;
	private Integer StudentID;


	public Integer getStudentQueryCondition() { return StudentQueryCondition; } 
	public String getQueryName() { return QueryName; } 
	public Integer getStudentID() { return StudentID; } 


	public void setStudentQueryCondition( Integer pStudentQueryCondition ) { this.StudentQueryCondition = pStudentQueryCondition; } 
	public void setQueryName( String pQueryName ) { this.QueryName = pQueryName; } 
	public void setStudentID( Integer pStudentID ) { this.StudentID = pStudentID; } 


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", StudentQueryCondition=").append(StudentQueryCondition);
		sb.append(", QueryName=").append(QueryName);
		sb.append(", StudentID=").append(StudentID);
		sb.append("]");
		return sb.toString();
	}

}