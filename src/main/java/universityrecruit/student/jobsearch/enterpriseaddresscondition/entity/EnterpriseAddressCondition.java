/**
 * The entity of EnterpriseAddressCondition，该文件主要用于传递数据
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.student.jobsearch.enterpriseaddresscondition.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("EnterpriseAddressCondition")
public class EnterpriseAddressCondition implements Serializable {

	private Integer EnterpriseAddressConditionID;
	private Integer ProvinceID;
	private Integer StudentQueryConditionID;


	public Integer getEnterpriseAddressConditionID() { return EnterpriseAddressConditionID; } 
	public Integer getProvinceID() { return ProvinceID; } 
	public Integer getStudentQueryConditionID() { return StudentQueryConditionID; } 


	public void setEnterpriseAddressConditionID( Integer pEnterpriseAddressConditionID ) { this.EnterpriseAddressConditionID = pEnterpriseAddressConditionID; } 
	public void setProvinceID( Integer pProvinceID ) { this.ProvinceID = pProvinceID; } 
	public void setStudentQueryConditionID( Integer pStudentQueryConditionID ) { this.StudentQueryConditionID = pStudentQueryConditionID; } 


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", EnterpriseAddressConditionID=").append(EnterpriseAddressConditionID);
		sb.append(", ProvinceID=").append(ProvinceID);
		sb.append(", StudentQueryConditionID=").append(StudentQueryConditionID);
		sb.append("]");
		return sb.toString();
	}

}