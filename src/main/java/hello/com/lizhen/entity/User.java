package hello.com.lizhen.entity;

import java.util.Date;

public class User {

    private int userid;
    private String username;
    private String usermail;
    private String userphone;
    private String userpassword;
    public User(int userid, String username,String usermail,String userphone,String userpassword) {
        this.userid = userid;
        this.username = username;
        this.usermail = usermail;
        this.userphone = userphone;
        this.userpassword = userpassword;
    }
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getUsermail() {
        return usermail;
    }

    public void setUsermail(String usermail) {
        this.usermail = usermail;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }
}
