package com.yan.ssm.model;

/**
 * Created by yan on 2017/6/20/0020.
 */
public class TblAdmin {
    private  long id;
    private String username;
    private String age;
    private  String password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}