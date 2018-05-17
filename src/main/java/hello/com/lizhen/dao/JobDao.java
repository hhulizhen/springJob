package hello.com.lizhen.dao;


import hello.com.lizhen.utils.JobUtils;
import hello.com.lizhen.entity.Job;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class JobDao {
    int id;
    String postName,componyName,workingPlace,pay,releaseTime;
    public boolean insert(Job job) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            //获得数据的连接
            conn = JobUtils.getConnection();
            //获得statement对象
            stmt = conn.createStatement();
            //发送SQL语句

            String sql="INSERT INTO job(id,postname,componyname,workingplace,pay,releasetime)"
                    +"VALUES("
                    +job.getId()
                    +",'"
                    +job.getPostName()
                    +"','"
                    +job.getComponyName()
                    +"','"
                    +job.getWorkingPlace()
                    +"','"
                    +job.getPay()
                    +"','"
                    +job.getReleaseTime()+"')";
            int num=stmt.executeUpdate(sql);
            if (num>0) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        } catch (Exception e) {
            // TODO: handle exception
        }finally {
            JobUtils.release(rs, stmt, conn);
        }

        return false;
    }
    //查询所有的User对象
    public ArrayList<Job> findAll() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Job> list = new ArrayList<Job>();
        try {
            //获得数据的连接
            conn = JobUtils.getConnection();
            //获得statment对象
            stmt = conn.createStatement();
            //发送sql语句
            String sql = "SELECT * FROM job limit 100";
            rs = stmt.executeQuery(sql);
            //处理结果集
            System.out.println(rs);

            while(rs.next()) {

                Job job = new Job(
                rs.getInt("id"),
                rs.getString ("postname"),
                rs.getString("componyname"),
                rs.getString("workingplace"),
                rs.getString("pay"),
                rs.getString("releasetime"));
                list.add(job);

            }


            return list;

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("连接失败");
        }
        finally {
            JobUtils.release(rs, stmt, conn);
        }

        return null;

    }
    //根据id查找指定的user
    public Job find(int id) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = JobUtils.getConnection();
            stmt = conn.createStatement();
            String sql = "SELECT * FROM job WHERE id="+id;
            rs = stmt.executeQuery(sql);
            //处理结果集
            while(rs.next()) {
                Job job = new Job(id,postName,componyName,workingPlace,pay,releaseTime);
                job.setId(rs.getInt("id"));
                job.setPostName(rs.getString ("postname"));
                job.setComponyName(rs.getString("componyname"));
                job.setWorkingPlace(rs.getString("workingplace"));
                job.setPay(rs.getString("pay"));
                job.setReleaseTime(rs.getString("releasetime"));
                return job;


            }
            return null;



        } catch (ClassNotFoundException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }finally {
            JobUtils.release(rs, stmt, conn);
        }


        return null;


    }
    //删除用户

    public boolean delete(int id) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = JobUtils.getConnection();
            stmt = conn.createStatement();
            String sql ="DELETE FROM job WHERE id="+id;
            int num=stmt.executeUpdate(sql);
            if (num>0) {
                return true;
            }
            return false;

        } catch (ClassNotFoundException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }finally {
            JobUtils.release(rs, stmt, conn);
        }


        return false;


    }
    //修改用户
    public boolean update (Job job) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = JobUtils.getConnection();
            stmt = conn.createStatement();
            /*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String birthday = sdf.format(user.getBirthday());*/
            String sql= "UPDATE job set name='"
                    +job.getPostName()
                    +",'"
                    +job.getComponyName()
                    +"','"
                    +job.getWorkingPlace()
                    +"','"
                    +job.getPay()
                    +"','"
                    +job.getReleaseTime()+"')";
            int num = stmt.executeUpdate(sql);
            if (num >0) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }finally {
            JobUtils.release(rs, stmt, conn);
        }

        return false;

    }
}

