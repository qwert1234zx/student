/**
 * The entity of SelectedSalaryCondition，该文件主要用于传递数据
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.student.jobsearch.selectedsalarycondition.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("SelectedSalaryCondition")
public class SelectedSalaryCondition implements Serializable {

	private Integer SelectedSalaryConditionID;
	private Float Salary;
	private String Operation;
	private Integer GroupNumber;
	private Integer StudentQueryConditionID;


	public Integer getSelectedSalaryConditionID() { return SelectedSalaryConditionID; } 
	public Float getSalary() { return Salary; } 
	public String getOperation() { return Operation; } 
	public Integer getGroupNumber() { return GroupNumber; } 
	public Integer getStudentQueryConditionID() { return StudentQueryConditionID; } 


	public void setSelectedSalaryConditionID( Integer pSelectedSalaryConditionID ) { this.SelectedSalaryConditionID = pSelectedSalaryConditionID; } 
	public void setSalary( Float pSalary ) { this.Salary = pSalary; } 
	public void setOperation( String pOperation ) { this.Operation = pOperation; } 
	public void setGroupNumber( Integer pGroupNumber ) { this.GroupNumber = pGroupNumber; } 
	public void setStudentQueryConditionID( Integer pStudentQueryConditionID ) { this.StudentQueryConditionID = pStudentQueryConditionID; } 


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", SelectedSalaryConditionID=").append(SelectedSalaryConditionID);
		sb.append(", Salary=").append(Salary);
		sb.append(", Operation=").append(Operation);
		sb.append(", GroupNumber=").append(GroupNumber);
		sb.append(", StudentQueryConditionID=").append(StudentQueryConditionID);
		sb.append("]");
		return sb.toString();
	}

}