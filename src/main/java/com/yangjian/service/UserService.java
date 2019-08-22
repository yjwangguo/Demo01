package com.yangjian.service;

import com.yangjian.model.User;

public interface UserService {
    boolean login(User user);
    boolean register(User user);
    User updateUser(User user);
    User queryUserByAccount(String account);
    User queryUserByEid(int e_id);
}
