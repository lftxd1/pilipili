package com.sp.demo.bean;

import java.util.List;

public class UserBean {
    private int id;
    private String name;
    private String password;
    private UserToken userToken;
    public int getId() {
        return id;
    }
    List<group> group;
    public UserToken getUserToken() {
        return userToken;
    }

    public void setUserToken(UserToken userToken) {
        this.userToken = userToken;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
