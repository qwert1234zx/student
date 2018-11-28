/**
 * The entity of UniversityTypeCondition，该文件主要用于传递数据
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.enterprise.studentsearch.universitytypecondition.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("UniversityTypeCondition")
public class UniversityTypeCondition implements Serializable {

	private Integer UniversityTypeConditionID;
	private Integer ConditionValue;
	private Integer EnterpriseQueryConditionID;


	public Integer getUniversityTypeConditionID() { return UniversityTypeConditionID; } 
	public Integer getConditionValue() { return ConditionValue; } 
	public Integer getEnterpriseQueryConditionID() { return EnterpriseQueryConditionID; } 


	public void setUniversityTypeConditionID( Integer pUniversityTypeConditionID ) { this.UniversityTypeConditionID = pUniversityTypeConditionID; } 
	public void setConditionValue( Integer pConditionValue ) { this.ConditionValue = pConditionValue; } 
	public void setEnterpriseQueryConditionID( Integer pEnterpriseQueryConditionID ) { this.EnterpriseQueryConditionID = pEnterpriseQueryConditionID; } 


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", UniversityTypeConditionID=").append(UniversityTypeConditionID);
		sb.append(", ConditionValue=").append(ConditionValue);
		sb.append(", EnterpriseQueryConditionID=").append(EnterpriseQueryConditionID);
		sb.append("]");
		return sb.toString();
	}

}