package com.sp.demo.dao;

import com.sp.demo.bean.Friend;
import com.sp.demo.bean.UserBean;
import com.sp.demo.bean.UserToken;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface UserDao {

    UserBean getUser(String name);
    void addUser(String name,String password);
    List<UserBean> getAllUser();
    UserToken getToken(int id);
    UserBean tokenGetUser(String token);
    List<UserBean> getGroupUser(int id);
    UserBean login(String name);
    Friend getFriends(int user);
    void insertInitFriend(Friend friend);
    void updateFriend(String friend,int user);
    void updatePassword(int id,String password);
}
