/**
 * The entity of TestTable，该文件主要用于传递数据
 * Created 2018/6/5
 * @author Howard Chung
 */
package universityrecruit.student.statistics.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.sql.Date;

@TableName("TestTable")
public class TestTable implements Serializable {
/*	public TestTable(Integer studentSumisNef, Integer studentSumisToo, Integer studentSumisDfg) {
		this.studentSumisNef = studentSumisNef;
		this.studentSumisToo = studentSumisToo;
		this.studentSumisDfg = studentSumisDfg;
	}*/

	private Integer studentSumisNef;
	private Integer  studentSumisToo;
	private Integer  studentSumisDfg;
	private Date interviewTime;


	public Integer getStudentSumisNef() {
		return studentSumisNef;
	}

	public void setStudentSumisNef(Integer studentSumisNef) {
		this.studentSumisNef = studentSumisNef;
	}

	public Integer getStudentSumisToo() {
		return studentSumisToo;
	}

	public void setStudentSumisToo(Integer studentSumisToo) {
		this.studentSumisToo = studentSumisToo;
	}

	public Integer getStudentSumisDfg() {
		return studentSumisDfg;
	}

	public void setStudentSumisDfg(Integer studentSumisDfg) {
		this.studentSumisDfg = studentSumisDfg;
	}

	public Date getInterviewTime() {
		return interviewTime;
	}

	public void setInterviewTime(Date interviewTime) {
		this.interviewTime = interviewTime;
	}

	@Override
	public String toString() {
		return "TestTable{" +
				"studentSumisNef=" + studentSumisNef +
				", studentSumisToo=" + studentSumisToo +
				", studentSumisDfg=" + studentSumisDfg +
				", interviewTime=" + interviewTime +
				'}';
	}
}