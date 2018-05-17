package hello.com.lizhen.test;

import hello.com.lizhen.dao.UserDao;
import hello.com.lizhen.entity.User;

public class FindUser {
    public static void main(String[] args){
        UserDao userDao = new UserDao();
        int userid = 0;
        String username = "";
        String usermail = "";
        String userphone = "";
        String userpassword = "";
        User user = new User(userid,username,usermail,userphone,userpassword);
        try {
            user = userDao.findFromId(10);
            System.out.println(
                    "id:"+user.getUserid()+" "+
                            "name:"+user.getUsername()+" "+
                            "password:"+user.getUserpassword()+" "+
                            "email:"+user.getUsermail()+" "+
                            "phone:"+user.getUserphone());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
