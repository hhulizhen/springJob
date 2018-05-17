package hello.com.lizhen.test;

import hello.com.lizhen.dao.JobDao;
import hello.com.lizhen.entity.Job;
/**
 * 
 * @author lizhen
 * 根据id查找用户名
 *
 */
public class Example07 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		JobDao jobDao = new JobDao();
		Job job = jobDao.find(1);
		System.out.println("id为1的用户的name为"+job.getPostName());
		
	}

}
