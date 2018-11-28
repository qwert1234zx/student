/**
 * The entity of SelectedSpecialityCondition，该文件主要用于传递数据
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.enterprise.studentsearch.selectedspecialitycondition.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("SelectedSpecialityCondition")
public class SelectedSpecialityCondition implements Serializable {

	private Integer SelectedSpecialityConditionID;
	private Integer SelectedSpecialityID;
	private Integer EnterpriseQueryConditionID;


	public Integer getSelectedSpecialityConditionID() { return SelectedSpecialityConditionID; } 
	public Integer getSelectedSpecialityID() { return SelectedSpecialityID; } 
	public Integer getEnterpriseQueryConditionID() { return EnterpriseQueryConditionID; } 


	public void setSelectedSpecialityConditionID( Integer pSelectedSpecialityConditionID ) { this.SelectedSpecialityConditionID = pSelectedSpecialityConditionID; } 
	public void setSelectedSpecialityID( Integer pSelectedSpecialityID ) { this.SelectedSpecialityID = pSelectedSpecialityID; } 
	public void setEnterpriseQueryConditionID( Integer pEnterpriseQueryConditionID ) { this.EnterpriseQueryConditionID = pEnterpriseQueryConditionID; } 


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", SelectedSpecialityConditionID=").append(SelectedSpecialityConditionID);
		sb.append(", SelectedSpecialityID=").append(SelectedSpecialityID);
		sb.append(", EnterpriseQueryConditionID=").append(EnterpriseQueryConditionID);
		sb.append("]");
		return sb.toString();
	}

}