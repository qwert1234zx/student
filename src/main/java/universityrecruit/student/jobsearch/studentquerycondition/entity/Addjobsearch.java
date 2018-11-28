package universityrecruit.student.jobsearch.studentquerycondition.entity;

/**
 * Created by dc on 2018/9/19.
 */
public class Addjobsearch {

    private Integer studentQueryCondition;
    private Integer provinceid;

    @Override
    public String toString() {
        return "Addjobsearch{" +
                "studentQueryCondition=" + studentQueryCondition +
                ", provinceid=" + provinceid +
                ", queryname='" + queryname + '\'' +
                ", studentid=" + studentid +
                ", operation='" + operation + '\'' +
                ", jobname='" + jobname + '\'' +
                ", uppersalary=" + uppersalary +
                '}';
    }

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    public Integer getStudentQueryCondition() {
        return studentQueryCondition;
    }

    public void setStudentQueryCondition(Integer studentQueryCondition) {
        this.studentQueryCondition = studentQueryCondition;
    }

    private String queryname;

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    private Integer studentid;
    private String operation;

    public String getQueryname() {
        return queryname;
    }

    public void setQueryname(String queryname) {
        this.queryname = queryname;
    }


    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
    }

    public Float getUppersalary() {
        return uppersalary;
    }

    public void setUppersalary(Float uppersalary) {
        this.uppersalary = uppersalary;
    }

    private String jobname;
    private Float uppersalary;
}
