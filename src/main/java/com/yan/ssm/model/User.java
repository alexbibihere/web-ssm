package com.yan.ssm.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yan on 2017/6/21/0021.
 */
public class User {
    private  int id;
    private String username;
    private String password;
    private String sex;
    private Date createTime;
    private Date modifiedTime;

    public User() {
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
