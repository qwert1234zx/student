/**
 * The entity of Job，该文件主要用于传递数据
 * Created 2018/9/18
 * @author Howard
 */
package universityrecruit.enterprise.interviewmanagement.job.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("Job")
public class Job implements Serializable {

	private Integer JobID;
	private Date ExpirationDate;
	private Integer UpperSalary;
	private Integer LowerSalary;
	private Integer PersonNumber;
	private String Requirement;
	private String Duty;
	private String JobName;
	private Integer EnterpriseID;


	public Integer getJobID() { return JobID; } 
	public Date getExpirationDate() { return ExpirationDate; } 
	public Integer getUpperSalary() { return UpperSalary; } 
	public Integer getLowerSalary() { return LowerSalary; } 
	public Integer getPersonNumber() { return PersonNumber; } 
	public String getRequirement() { return Requirement; } 
	public String getDuty() { return Duty; } 
	public String getJobName() { return JobName; } 
	public Integer getEnterpriseID() { return EnterpriseID; } 


	public void setJobID( Integer pJobID ) { this.JobID = pJobID; } 
	public void setExpirationDate( Date pExpirationDate ) { this.ExpirationDate = pExpirationDate; } 
	public void setUpperSalary( Integer pUpperSalary ) { this.UpperSalary = pUpperSalary; } 
	public void setLowerSalary( Integer pLowerSalary ) { this.LowerSalary = pLowerSalary; } 
	public void setPersonNumber( Integer pPersonNumber ) { this.PersonNumber = pPersonNumber; } 
	public void setRequirement( String pRequirement ) { this.Requirement = pRequirement; } 
	public void setDuty( String pDuty ) { this.Duty = pDuty; } 
	public void setJobName( String pJobName ) { this.JobName = pJobName; } 
	public void setEnterpriseID( Integer pEnterpriseID ) { this.EnterpriseID = pEnterpriseID; } 


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", JobID=").append(JobID);
		sb.append(", ExpirationDate=").append(ExpirationDate);
		sb.append(", UpperSalary=").append(UpperSalary);
		sb.append(", LowerSalary=").append(LowerSalary);
		sb.append(", PersonNumber=").append(PersonNumber);
		sb.append(", Requirement=").append(Requirement);
		sb.append(", Duty=").append(Duty);
		sb.append(", JobName=").append(JobName);
		sb.append(", EnterpriseID=").append(EnterpriseID);
		sb.append("]");
		return sb.toString();
	}

}