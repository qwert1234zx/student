/**
 * The entity of InterviewRecord，该文件主要用于传递数据
 * Created 2018/9/18
 * @author Howard
 */
package universityrecruit.student.interviewmanagement.interviewrecord.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("InterviewRecord")
public class InterviewRecord implements Serializable {

	private Integer InterviewRecordID;
	private String StudentRemark;
	private Integer StudentRate;
	private String InterviewerRemark;
	private Integer InterviewerConclusion;
	private String InterviewerMobile;
	private String Interviewer;
	private Date InterviewTime;
	private Integer CandidateID;


	public Integer getInterviewRecordID() { return InterviewRecordID; } 
	public String getStudentRemark() { return StudentRemark; } 
	public Integer getStudentRate() { return StudentRate; } 
	public String getInterviewerRemark() { return InterviewerRemark; } 
	public Integer getInterviewerConclusion() { return InterviewerConclusion; } 
	public String getInterviewerMobile() { return InterviewerMobile; } 
	public String getInterviewer() { return Interviewer; } 
	public Date getInterviewTime() { return InterviewTime; } 
	public Integer getCandidateID() { return CandidateID; } 


	public void setInterviewRecordID( Integer pInterviewRecordID ) { this.InterviewRecordID = pInterviewRecordID; } 
	public void setStudentRemark( String pStudentRemark ) { this.StudentRemark = pStudentRemark; } 
	public void setStudentRate( Integer pStudentRate ) { this.StudentRate = pStudentRate; } 
	public void setInterviewerRemark( String pInterviewerRemark ) { this.InterviewerRemark = pInterviewerRemark; } 
	public void setInterviewerConclusion( Integer pInterviewerConclusion ) { this.InterviewerConclusion = pInterviewerConclusion; } 
	public void setInterviewerMobile( String pInterviewerMobile ) { this.InterviewerMobile = pInterviewerMobile; } 
	public void setInterviewer( String pInterviewer ) { this.Interviewer = pInterviewer; } 
	public void setInterviewTime( Date pInterviewTime ) { this.InterviewTime = pInterviewTime; } 
	public void setCandidateID( Integer pCandidateID ) { this.CandidateID = pCandidateID; } 


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", InterviewRecordID=").append(InterviewRecordID);
		sb.append(", StudentRemark=").append(StudentRemark);
		sb.append(", StudentRate=").append(StudentRate);
		sb.append(", InterviewerRemark=").append(InterviewerRemark);
		sb.append(", InterviewerConclusion=").append(InterviewerConclusion);
		sb.append(", InterviewerMobile=").append(InterviewerMobile);
		sb.append(", Interviewer=").append(Interviewer);
		sb.append(", InterviewTime=").append(InterviewTime);
		sb.append(", CandidateID=").append(CandidateID);
		sb.append("]");
		return sb.toString();
	}

}