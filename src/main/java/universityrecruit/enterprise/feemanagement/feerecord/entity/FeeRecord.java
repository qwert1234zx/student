/**
 * The entity of FeeRecord，该文件主要用于传递数据
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.enterprise.feemanagement.feerecord.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("FeeRecord")
public class FeeRecord implements Serializable {

	private Integer FeeRecordID;
	private Float Balance;
	private Float Expense;
	private Float Income;
	private Date RecordDate;
	private Integer EnterpriseID;


	public Integer getFeeRecordID() { return FeeRecordID; } 
	public Float getBalance() { return Balance; } 
	public Float getExpense() { return Expense; } 
	public Float getIncome() { return Income; } 
	public Date getRecordDate() { return RecordDate; } 
	public Integer getEnterpriseID() { return EnterpriseID; } 


	public void setFeeRecordID( Integer pFeeRecordID ) { this.FeeRecordID = pFeeRecordID; } 
	public void setBalance( Float pBalance ) { this.Balance = pBalance; } 
	public void setExpense( Float pExpense ) { this.Expense = pExpense; } 
	public void setIncome( Float pIncome ) { this.Income = pIncome; } 
	public void setRecordDate( Date pRecordDate ) { this.RecordDate = pRecordDate; } 
	public void setEnterpriseID( Integer pEnterpriseID ) { this.EnterpriseID = pEnterpriseID; } 


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", FeeRecordID=").append(FeeRecordID);
		sb.append(", Balance=").append(Balance);
		sb.append(", Expense=").append(Expense);
		sb.append(", Income=").append(Income);
		sb.append(", RecordDate=").append(RecordDate);
		sb.append(", EnterpriseID=").append(EnterpriseID);
		sb.append("]");
		return sb.toString();
	}

}