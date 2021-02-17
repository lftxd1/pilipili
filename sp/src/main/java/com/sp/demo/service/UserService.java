package com.sp.demo.service;

import com.sp.demo.bean.UserBean;
import com.sp.demo.bean.UserToken;
import com.sp.demo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;

public class UserService{

    @Autowired
    private UserDao userDao;

    public List<UserBean> getAllUser() {
        return userDao.getAllUser();
    }

    public UserBean getUserInfo(String name) {
        return userDao.getUser(name);
    }

    public Boolean register(String name, String password) {
        userDao.addUser(name,password);
        return true;
    }


    public UserToken getToken() {
        return null;
    }

    public UserBean login(String name){return userDao.login(name);}
}
