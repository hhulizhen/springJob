package hello.com.lizhen.test;

import hello.com.lizhen.dao.UserDao;
import hello.com.lizhen.entity.User;

import java.sql.SQLException;

public class InsertUser {

    public static void main(String[] args){
        UserDao userDao = new UserDao();
        User user = new User(
        10,
        "lizhen",
        "hhulizhen@hotmail.com",
        "123411234",
        "lizhen520"
        );
        try {
            boolean b = userDao.insert(user);
            System.out.println(b);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
