package hello.com.lizhen.test;

import hello.com.lizhen.dao.JobDao;
import hello.com.lizhen.entity.Job;

import java.sql.SQLException;

public class textJob {

    public static void main(String[] args) {
        int id = 0;
        String postname="",componyname="",workingplace="",pay = "",releasetime = "";
        JobDao ud = new JobDao();
        Job job = new Job(id,postname,componyname,workingplace,pay,releasetime);
        job.setId(1);
        job.setPostName("textdata");
        job.setComponyName("textdata");
        job.setWorkingPlace("textdata");
        job.setPay("textdata");
        job.setReleaseTime("2018-5-15");
        try {
            boolean b = ud.insert(job);
            System.out.println(b);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
