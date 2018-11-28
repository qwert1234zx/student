package universityrecruit.testfile.entity;

/**
 * Created by dc on 2018/10/3.
 */
public class Picture {
    private Integer picid;
    private String name;
    private String address;

    public Integer getPicid() {
        return picid;
    }

    public void setPicid(Integer picid) {
        this.picid = picid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "picid=" + picid +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
