package com.yangjian.dao;

import com.yangjian.model.User;

public interface UserDao {
    boolean addUser(User user);
    User updateUser(User user);
    User queryUserByAccount(String account);
    User queryUserByEid(int e_id);
}
