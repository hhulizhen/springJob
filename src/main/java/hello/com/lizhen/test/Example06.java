package hello.com.lizhen.test;

import java.util.ArrayList;

import hello.com.lizhen.dao.JobDao;
import hello.com.lizhen.entity.Job;

public class Example06 {

/**
 * @author lizhen
 * @param args
 * 打印出所有username的值
 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		JobDao jobDao = new JobDao();
        ArrayList<Job> jobArrayList = jobDao.findAll();


			for (int i = 0;i<jobArrayList.size();i++){
                System.out.println("第"+(i+1)+"条数据的username值为："+jobArrayList.get(i).getPostName());
            }
			

        /*UserDao ud = new UserDao();
        ArrayList<User>list = ud.findAll();
        for (  int i=0; i < list.size(); i++)
        {
            System.out.println("第"+(i+1)+"条数据的username值为："+list.get(i).getUsername());

        }*/
	}

}
