package hello.com.lizhen.dao;


import hello.com.lizhen.entity.User;
import hello.com.lizhen.utils.JobUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class UserDao {

    //增加一条用户信息
    public boolean insert(User user) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            //获得数据的连接
            conn = JobUtils.getConnection();
            //获得statement对象
            stmt = conn.createStatement();
            //发送SQL语句

            String sql="INSERT INTO users(userid,username,usermail,userphone,userpassword)"
                    +"VALUES("
                    +user.getUserid()
                    +",'"
                    +user.getUsername()
                    +"','"
                    +user.getUsermail()
                    +"','"
                    +user.getUserphone()
                    +"','"
                    +user.getUserpassword()+"')";
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
    public ArrayList<User> findAll() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<User>list = new ArrayList<User>();
        try {
            //获得数据的连接
            conn = JobUtils.getConnection();
            //获得statment对象
            stmt = conn.createStatement();
            //发送sql语句
            String sql = "SELECT * FROM users";
            rs = stmt.executeQuery(sql);
            //处理结果集
            while (rs.next()) {
                User user = new User(
                        rs.getInt("userid"),
                        rs.getString ("username"),
                        rs.getString("usermail"),
                        rs.getString("userphone"),
                        rs.getString("userpassword")
                        );
                list.add(user);


            }
            return list;

        } catch (Exception e) {
            // TODO: handle exception
        }
        finally {
            JobUtils.release(rs, stmt, conn);
        }

        return null;

    }
    //根据id查找指定的user
    public User findFromId(int id) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = JobUtils.getConnection();
            stmt = conn.createStatement();
            String sql = "SELECT * FROM users WHERE userid="+id;
            rs = stmt.executeQuery(sql);
            //处理结果集
            while(rs.next()) {
                User user = new User(
                        rs.getInt("userid"),
                        rs.getString ("username"),
                        rs.getString("usermail"),
                        rs.getString("userphone"),
                        rs.getString("userpassword")
                        );
                return user;


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
            String sql ="DELETE FROM users WHERE userid="+id;
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
    public boolean update (User user) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = JobUtils.getConnection();
            stmt = conn.createStatement();
            String sql= "UPDATE users set username='"
                    +user.getUsername()
                    +"',usermail='"
                    +user.getUsermail()
                    +"',userphone='"
                    +user.getUserphone()
                    +"',userpassword='"
                    +user.getUserpassword()
                    +"' WHERE userid="+user.getUserid();
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