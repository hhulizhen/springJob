package hello.com.lizhen.test;

import hello.com.lizhen.dao.UserDao;
import hello.com.lizhen.entity.User;

public class UpdateUser {
    public static void main(String[] args){
        UserDao userDao = new UserDao();
        User user = new User(
        10,
        "aosiudhqoi",
        "askdj",
        "aksjdh",
        "12341234"
);
            boolean b = userDao.update(user);
            System.out.println(b);

    }
}
