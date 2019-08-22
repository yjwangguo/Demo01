package com.yangjian.dao;

import com.yangjian.model.EmailContent;

import java.util.List;

public interface EmailContentDao {
    boolean addEmailContent(EmailContent emailContent);
    boolean delEmailContent(int ec_id);
    List<EmailContent> queryEmailContentByEid(int e_id);
    EmailContent updateEmailContent(EmailContent emailContent);
}
