package com.yangjian.service.impl;

import com.yangjian.dao.UserDao;
import com.yangjian.model.User;
import com.yangjian.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    public boolean login(User user) {//登录 没对账号密码判空 想在界面用ajax判空
        User user1 = userDao.queryUserByAccount(user.getU_account());
        if (user1==null){
            return false;
        }
        if (user1.getU_pass().equals(user.getU_pass())){
            return true;
        }
        return false;
    }

    public boolean register(User user) {//同上 没判空
        User user1 = userDao.queryUserByAccount(user.getU_account());
        if (user1!=null){
            return  false;
        }
        return userDao.addUser(user);
    }

    public User updateUser(User user) {
        return userDao.updateUser(user);
    }

    public User queryUserByAccount(String account) {
        return userDao.queryUserByAccount(account);
    }

    public User queryUserByEid(int e_id) {
        return userDao.queryUserByEid(e_id);
    }
}
