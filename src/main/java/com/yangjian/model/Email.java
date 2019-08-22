package com.yangjian.model;

import java.util.List;

public class Email {//邮件
    private Integer e_id;
    private String e_name;
    private User user;//一对一(主)
    private List<EmailContent> emailContents;//一对多（主）

    public Email() {
    }

    public Email(String e_name) {
        this.e_name = e_name;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public Integer getE_id() {
        return e_id;
    }

    public void setE_id(Integer e_id) {
        this.e_id = e_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<EmailContent> getEmailContents() {
        return emailContents;
    }

    public void setEmailContents(List<EmailContent> emailContents) {
        this.emailContents = emailContents;
    }

    @Override
    public String toString() {
        return "Email{" +
                "e_id=" + e_id +
                ", e_name='" + e_name + '\'' +
                ", emailContents=" + emailContents +
                '}';
    }
}
