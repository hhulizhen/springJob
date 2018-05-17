package hello.com.lizhen.entity;

import org.springframework.boot.autoconfigure.batch.BatchProperties;
import sun.management.snmp.jvmmib.JvmOSMBean;

public class Job {
    int id;
    String postName;
    String componyName;
    String workingPlace;
    String pay;
    String releaseTime;
    public Job(int id, String postName,String componyName,String workingPlace,String pay,String releaseTime) {
        this.id = id;
        this.postName = postName;
        this.componyName = componyName;
        this.workingPlace = workingPlace;
        this.pay = pay;
        this.releaseTime = releaseTime;
    }
    public int getId() {
        return id;
    }

    public String getComponyName() {
        return componyName;
    }

    public String getPay() {
        return pay;
    }

    public String getPostName() {
        return postName;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public String getWorkingPlace() {
        return workingPlace;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setComponyName(String componyName) {
        this.componyName = componyName;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    public void setWorkingPlace(String workingPlace) {
        this.workingPlace = workingPlace;
    }

}
