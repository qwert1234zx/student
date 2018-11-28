/**
 * The entity of InterviewRecord，该文件主要用于传递数据
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.university.statistics.interviewrecord.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("InterviewRecord")
public class InterviewRecord implements Serializable {

	private Integer InterviewRecordID;
	private String InterviewResult;
	private String InterviewerMobile;
	private String Interviewer;
	private Integer InterviewStatus;
	private Date InterviewTime;
	private Integer StudentID;
	private Integer EnterpriseID;


	public Integer getInterviewRecordID() { return InterviewRecordID; } 
	public String getInterviewResult() { return InterviewResult; } 
	public String getInterviewerMobile() { return InterviewerMobile; } 
	public String getInterviewer() { return Interviewer; } 
	public Integer getInterviewStatus() { return InterviewStatus; } 
	public Date getInterviewTime() { return InterviewTime; } 
	public Integer getStudentID() { return StudentID; } 
	public Integer getEnterpriseID() { return EnterpriseID; } 


	public void setInterviewRecordID( Integer pInterviewRecordID ) { this.InterviewRecordID = pInterviewRecordID; } 
	public void setInterviewResult( String pInterviewResult ) { this.InterviewResult = pInterviewResult; } 
	public void setInterviewerMobile( String pInterviewerMobile ) { this.InterviewerMobile = pInterviewerMobile; } 
	public void setInterviewer( String pInterviewer ) { this.Interviewer = pInterviewer; } 
	public void setInterviewStatus( Integer pInterviewStatus ) { this.InterviewStatus = pInterviewStatus; } 
	public void setInterviewTime( Date pInterviewTime ) { this.InterviewTime = pInterviewTime; } 
	public void setStudentID( Integer pStudentID ) { this.StudentID = pStudentID; } 
	public void setEnterpriseID( Integer pEnterpriseID ) { this.EnterpriseID = pEnterpriseID; } 


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", InterviewRecordID=").append(InterviewRecordID);
		sb.append(", InterviewResult=").append(InterviewResult);
		sb.append(", InterviewerMobile=").append(InterviewerMobile);
		sb.append(", Interviewer=").append(Interviewer);
		sb.append(", InterviewStatus=").append(InterviewStatus);
		sb.append(", InterviewTime=").append(InterviewTime);
		sb.append(", StudentID=").append(StudentID);
		sb.append(", EnterpriseID=").append(EnterpriseID);
		sb.append("]");
		return sb.toString();
	}

}