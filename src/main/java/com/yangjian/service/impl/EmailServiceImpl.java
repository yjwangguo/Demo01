package com.yangjian.service.impl;

import com.yangjian.dao.EmailDao;
import com.yangjian.model.Email;
import com.yangjian.service.EmailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EmailServiceImpl implements EmailService {
    @Resource
    private EmailDao emailDao;
    public boolean addEmail(Email email) {
        Email email1 = emailDao.queryByName(email.getE_name());
        if (email1!=null){
            return false;
        }
        return emailDao.addEmail(email);
    }

    public boolean delEmail(int e_id) {
        return emailDao.delEmail(e_id);
    }

    public Email queryById(int e_id) {
        return emailDao.queryById(e_id);
    }

    public Email queryByName(String e_name) {
        return emailDao.queryByName(e_name);
    }
}
