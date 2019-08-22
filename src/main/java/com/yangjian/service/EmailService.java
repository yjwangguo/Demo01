package com.yangjian.service;

import com.yangjian.model.Email;

public interface EmailService {
    boolean addEmail(Email email);
    boolean delEmail(int e_id);
    Email queryById(int e_id);
    Email queryByName(String e_name);
}
