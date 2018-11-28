/**
 * The entity of Candidate，该文件主要用于传递数据
 * Created 2018/9/18
 * @author Howard
 */
package universityrecruit.student.interviewmanagement.candidate.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("Candidate")
public class Candidate implements Serializable {

	private Integer CandidateID;
	private Integer InterviewStatus;
	private Integer StudentID;
	private Integer JobID;


	public Integer getCandidateID() { return CandidateID; } 
	public Integer getInterviewStatus() { return InterviewStatus; } 
	public Integer getStudentID() { return StudentID; } 
	public Integer getJobID() { return JobID; } 


	public void setCandidateID( Integer pCandidateID ) { this.CandidateID = pCandidateID; } 
	public void setInterviewStatus( Integer pInterviewStatus ) { this.InterviewStatus = pInterviewStatus; } 
	public void setStudentID( Integer pStudentID ) { this.StudentID = pStudentID; } 
	public void setJobID( Integer pJobID ) { this.JobID = pJobID; } 


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", CandidateID=").append(CandidateID);
		sb.append(", InterviewStatus=").append(InterviewStatus);
		sb.append(", StudentID=").append(StudentID);
		sb.append(", JobID=").append(JobID);
		sb.append("]");
		return sb.toString();
	}

}