/**
 * The entity of SelectedCourseCondition，该文件主要用于传递数据
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.enterprise.studentsearch.selectedcoursecondition.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("SelectedCourseCondition")
public class SelectedCourseCondition implements Serializable {

	private Integer SelectedCourseConditionID;
	private Float Score;
	private String Operation;
	private Integer CourseID;
	private Integer GroupNumber;
	private Integer EnterpriseQueryConditionID;


	public Integer getSelectedCourseConditionID() { return SelectedCourseConditionID; } 
	public Float getScore() { return Score; } 
	public String getOperation() { return Operation; } 
	public Integer getCourseID() { return CourseID; } 
	public Integer getGroupNumber() { return GroupNumber; } 
	public Integer getEnterpriseQueryConditionID() { return EnterpriseQueryConditionID; } 


	public void setSelectedCourseConditionID( Integer pSelectedCourseConditionID ) { this.SelectedCourseConditionID = pSelectedCourseConditionID; } 
	public void setScore( Float pScore ) { this.Score = pScore; } 
	public void setOperation( String pOperation ) { this.Operation = pOperation; } 
	public void setCourseID( Integer pCourseID ) { this.CourseID = pCourseID; } 
	public void setGroupNumber( Integer pGroupNumber ) { this.GroupNumber = pGroupNumber; } 
	public void setEnterpriseQueryConditionID( Integer pEnterpriseQueryConditionID ) { this.EnterpriseQueryConditionID = pEnterpriseQueryConditionID; } 


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", SelectedCourseConditionID=").append(SelectedCourseConditionID);
		sb.append(", Score=").append(Score);
		sb.append(", Operation=").append(Operation);
		sb.append(", CourseID=").append(CourseID);
		sb.append(", GroupNumber=").append(GroupNumber);
		sb.append(", EnterpriseQueryConditionID=").append(EnterpriseQueryConditionID);
		sb.append("]");
		return sb.toString();
	}

}