/**
 * The entity of DegreeTypeCondition，该文件主要用于传递数据
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.enterprise.studentsearch.degreetypecondition.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("DegreeTypeCondition")
public class DegreeTypeCondition implements Serializable {

	private Integer DegreeTypeConditionID;
	private Integer ConditionValue;
	private Integer EnterpriseQueryConditionID;


	public Integer getDegreeTypeConditionID() { return DegreeTypeConditionID; } 
	public Integer getConditionValue() { return ConditionValue; } 
	public Integer getEnterpriseQueryConditionID() { return EnterpriseQueryConditionID; } 


	public void setDegreeTypeConditionID( Integer pDegreeTypeConditionID ) { this.DegreeTypeConditionID = pDegreeTypeConditionID; } 
	public void setConditionValue( Integer pConditionValue ) { this.ConditionValue = pConditionValue; } 
	public void setEnterpriseQueryConditionID( Integer pEnterpriseQueryConditionID ) { this.EnterpriseQueryConditionID = pEnterpriseQueryConditionID; } 


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", DegreeTypeConditionID=").append(DegreeTypeConditionID);
		sb.append(", ConditionValue=").append(ConditionValue);
		sb.append(", EnterpriseQueryConditionID=").append(EnterpriseQueryConditionID);
		sb.append("]");
		return sb.toString();
	}

}