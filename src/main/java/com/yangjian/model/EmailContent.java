package com.yangjian.model;

import java.util.Date;

public class EmailContent {//邮件内容
    private Integer ec_id;
    private Email email;//多对一（从）
    private String ec_content;
    private Date ec_date;

    public EmailContent() {
    }

    public Integer getEc_id() {
        return ec_id;
    }

    public void setEc_id(Integer ec_id) {
        this.ec_id = ec_id;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public String getEc_content() {
        return ec_content;
    }

    public void setEc_content(String ec_content) {
        this.ec_content = ec_content;
    }

    public Date getEc_date() {
        return ec_date;
    }

    public void setEc_date(Date ec_date) {
        this.ec_date = ec_date;
    }

    @Override
    public String toString() {
        return "EmailContent{" +
                "ec_id=" + ec_id +
                ", ec_content='" + ec_content + '\'' +
                ", ec_date=" + ec_date +
                '}';
    }
}
