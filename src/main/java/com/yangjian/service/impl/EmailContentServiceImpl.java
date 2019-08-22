package com.yangjian.service.impl;

import com.yangjian.dao.EmailContentDao;
import com.yangjian.model.EmailContent;
import com.yangjian.service.EmailContentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class EmailContentServiceImpl implements EmailContentService {
    @Resource
    private EmailContentDao emailContentDao;
    public boolean addEmailContent(EmailContent emailContent) {//页面判断内容是否为空
        return emailContentDao.addEmailContent(emailContent);
    }

    public boolean delEmailContent(int ec_id) {
        return emailContentDao.delEmailContent(ec_id);
    }

    public List<EmailContent> queryEmailContentByEid(int e_id) {
        return emailContentDao.queryEmailContentByEid(e_id);
    }

    public EmailContent updateEmailContent(EmailContent emailContent) {
        return emailContentDao.updateEmailContent(emailContent);
    }
}
