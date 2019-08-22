package com.yangjian.dao;

import com.yangjian.model.Email;

public interface EmailDao {
    boolean addEmail(Email email);
    boolean delEmail(int e_id);
    Email queryById(int e_id);
    Email queryByName(String e_name);
}
