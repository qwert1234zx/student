/**
 * The entity of EnterpriseQueryCondition，该文件主要用于传递数据
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.enterprise.studentsearch.enterprisequerycondition.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("EnterpriseQueryCondition")
public class EnterpriseQueryCondition implements Serializable {

	private Integer EnterpriseQueryConditionID;
	private String QueryName;
	private Integer EnterpriseUserID;


	public Integer getEnterpriseQueryConditionID() { return EnterpriseQueryConditionID; } 
	public String getQueryName() { return QueryName; } 
	public Integer getEnterpriseUserID() { return EnterpriseUserID; } 


	public void setEnterpriseQueryConditionID( Integer pEnterpriseQueryConditionID ) { this.EnterpriseQueryConditionID = pEnterpriseQueryConditionID; } 
	public void setQueryName( String pQueryName ) { this.QueryName = pQueryName; } 
	public void setEnterpriseUserID( Integer pEnterpriseUserID ) { this.EnterpriseUserID = pEnterpriseUserID; } 


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", EnterpriseQueryConditionID=").append(EnterpriseQueryConditionID);
		sb.append(", QueryName=").append(QueryName);
		sb.append(", EnterpriseUserID=").append(EnterpriseUserID);
		sb.append("]");
		return sb.toString();
	}

}