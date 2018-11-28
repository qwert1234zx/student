/**
 * The entity of ChargeRule，该文件主要用于传递数据
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.enterprise.feemanagement.chargerule.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("ChargeRule")
public class ChargeRule implements Serializable {

	private Integer ChargeRuleID;
	private Float FeePerResume;
	private Date EffectiveDate;


	public Integer getChargeRuleID() { return ChargeRuleID; } 
	public Float getFeePerResume() { return FeePerResume; } 
	public Date getEffectiveDate() { return EffectiveDate; } 


	public void setChargeRuleID( Integer pChargeRuleID ) { this.ChargeRuleID = pChargeRuleID; } 
	public void setFeePerResume( Float pFeePerResume ) { this.FeePerResume = pFeePerResume; } 
	public void setEffectiveDate( Date pEffectiveDate ) { this.EffectiveDate = pEffectiveDate; } 


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", ChargeRuleID=").append(ChargeRuleID);
		sb.append(", FeePerResume=").append(FeePerResume);
		sb.append(", EffectiveDate=").append(EffectiveDate);
		sb.append("]");
		return sb.toString();
	}

}