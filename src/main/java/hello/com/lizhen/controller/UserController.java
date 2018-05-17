package hello.com.lizhen.controller;

import hello.com.lizhen.dao.UserDao;
import hello.com.lizhen.entity.Greeting;
import hello.com.lizhen.entity.User;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

@RestController
public class UserController {

    @RequestMapping("/user")
    public ArrayList<User> user(HttpServletRequest request, HttpServletResponse response,
                                @RequestParam(value = "userid",defaultValue = "1") int userid,
                                @RequestParam(value = "username",defaultValue = "name") String username,
                                @RequestParam(value = "usermail",defaultValue = "email@xx.com") String usermail,
                                @RequestParam(value = "userphone",defaultValue = "userphone") String userphone,
                                @RequestParam(value = "userpassword",defaultValue = "userpassword") String userpassword) {
        UserDao userDao = new UserDao();
        ArrayList<User> userArrayList = userDao.findAll();
        return userArrayList;

    }


}
