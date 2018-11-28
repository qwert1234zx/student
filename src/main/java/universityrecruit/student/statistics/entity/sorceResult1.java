package universityrecruit.student.statistics.entity;

/**
 * Created by sw on 2018/9/26.
 */
public class sorceResult1 {
        private String industryName;
        private Integer indlnviSum;


    public sorceResult1(String industryName, Integer indlnviSum) {
        this.industryName = industryName;
        this.indlnviSum = indlnviSum;
    }
    public sorceResult1() {

    }

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName;
    }

    public Integer getIndlnviSum() {
        return indlnviSum;
    }

    public void setIndlnviSum(int indlnviSum) {
        this.indlnviSum = indlnviSum;
    }



    @Override
    public String toString() {
        return "sorceResult1{" +
                "industryName='" + industryName + '\'' +
                ", indlnviSum=" + indlnviSum +
                '}';
    }
}
