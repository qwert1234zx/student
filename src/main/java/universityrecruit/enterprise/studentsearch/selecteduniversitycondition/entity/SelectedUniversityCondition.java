/**
 * The entity of SelectedUniversityCondition，该文件主要用于传递数据
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.enterprise.studentsearch.selecteduniversitycondition.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("SelectedUniversityCondition")
public class SelectedUniversityCondition implements Serializable {

	private Integer SelectedUniversityConditionID;
	private Integer SelectedUniversityID;
	private Integer EnterpriseQueryConditionID;


	public Integer getSelectedUniversityConditionID() { return SelectedUniversityConditionID; } 
	public Integer getSelectedUniversityID() { return SelectedUniversityID; } 
	public Integer getEnterpriseQueryConditionID() { return EnterpriseQueryConditionID; } 


	public void setSelectedUniversityConditionID( Integer pSelectedUniversityConditionID ) { this.SelectedUniversityConditionID = pSelectedUniversityConditionID; } 
	public void setSelectedUniversityID( Integer pSelectedUniversityID ) { this.SelectedUniversityID = pSelectedUniversityID; } 
	public void setEnterpriseQueryConditionID( Integer pEnterpriseQueryConditionID ) { this.EnterpriseQueryConditionID = pEnterpriseQueryConditionID; } 


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", SelectedUniversityConditionID=").append(SelectedUniversityConditionID);
		sb.append(", SelectedUniversityID=").append(SelectedUniversityID);
		sb.append(", EnterpriseQueryConditionID=").append(EnterpriseQueryConditionID);
		sb.append("]");
		return sb.toString();
	}

}