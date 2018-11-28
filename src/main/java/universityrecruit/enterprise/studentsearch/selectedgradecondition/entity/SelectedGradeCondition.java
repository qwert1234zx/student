/**
 * The entity of SelectedGradeCondition，该文件主要用于传递数据
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.enterprise.studentsearch.selectedgradecondition.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("SelectedGradeCondition")
public class SelectedGradeCondition implements Serializable {

	private Integer SelectedGradeConditionID;
	private Integer SelectedGrade;
	private Integer EnterpriseQueryConditionID;


	public Integer getSelectedGradeConditionID() { return SelectedGradeConditionID; } 
	public Integer getSelectedGrade() { return SelectedGrade; } 
	public Integer getEnterpriseQueryConditionID() { return EnterpriseQueryConditionID; } 


	public void setSelectedGradeConditionID( Integer pSelectedGradeConditionID ) { this.SelectedGradeConditionID = pSelectedGradeConditionID; } 
	public void setSelectedGrade( Integer pSelectedGrade ) { this.SelectedGrade = pSelectedGrade; } 
	public void setEnterpriseQueryConditionID( Integer pEnterpriseQueryConditionID ) { this.EnterpriseQueryConditionID = pEnterpriseQueryConditionID; } 


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", SelectedGradeConditionID=").append(SelectedGradeConditionID);
		sb.append(", SelectedGrade=").append(SelectedGrade);
		sb.append(", EnterpriseQueryConditionID=").append(EnterpriseQueryConditionID);
		sb.append("]");
		return sb.toString();
	}

}