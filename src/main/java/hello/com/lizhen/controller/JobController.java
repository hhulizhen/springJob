package hello.com.lizhen.controller;

import hello.com.lizhen.dao.JobDao;
import hello.com.lizhen.entity.Greeting;
import hello.com.lizhen.entity.Job;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
@RestController
public class JobController {


    @RequestMapping("/job")
    public ArrayList<Job> job(HttpServletRequest request, HttpServletResponse response,
                   @RequestParam(value="id",defaultValue = "10") int id ,
                   @RequestParam(value="postname", defaultValue="postname") String postname,
                   @RequestParam(value="componyname", defaultValue="componyname") String componyname,
                   @RequestParam(value="workingplace", defaultValue="workingplace") String workingplace,
                   @RequestParam(value="pay", defaultValue="pay") String pay,
                   @RequestParam(value="releasetime", defaultValue="releasetime") String releasetime
            ) {

        JobDao jobDao = new JobDao();
        ArrayList<Job> list = jobDao.findAll();

        return list;
        //return new Job(id,job.getPostName(),job.getComponyName(),job.getWorkingPlace(),job.getPay(),job.getReleaseTime());

    }
}