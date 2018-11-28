/**
 * The entity of SelectedHometownCondition，该文件主要用于传递数据
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.enterprise.studentsearch.selectedhometowncondition.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("SelectedHometownCondition")
public class SelectedHometownCondition implements Serializable {

	private Integer SelectedHometownConditionID;
	private Integer ProvinceID;
	private Integer EnterpriseQueryConditionID;


	public Integer getSelectedHometownConditionID() { return SelectedHometownConditionID; } 
	public Integer getProvinceID() { return ProvinceID; } 
	public Integer getEnterpriseQueryConditionID() { return EnterpriseQueryConditionID; } 


	public void setSelectedHometownConditionID( Integer pSelectedHometownConditionID ) { this.SelectedHometownConditionID = pSelectedHometownConditionID; } 
	public void setProvinceID( Integer pProvinceID ) { this.ProvinceID = pProvinceID; } 
	public void setEnterpriseQueryConditionID( Integer pEnterpriseQueryConditionID ) { this.EnterpriseQueryConditionID = pEnterpriseQueryConditionID; } 


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", SelectedHometownConditionID=").append(SelectedHometownConditionID);
		sb.append(", ProvinceID=").append(ProvinceID);
		sb.append(", EnterpriseQueryConditionID=").append(EnterpriseQueryConditionID);
		sb.append("]");
		return sb.toString();
	}

}