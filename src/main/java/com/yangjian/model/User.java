package com.yangjian.model;

import java.util.Date;

public class User {//用户
    private Integer u_id;
    private String u_name;
    private String u_pass;
    private Email email;//一对一 （从）
    private String u_address;
    private Integer u_age;
    private String u_account;
    private String u_schoolTag;
    private Date u_timeOfRaduation;

    public User() {
    }

    public User(String u_account,String u_pass) {
        this.u_pass = u_pass;
        this.u_account = u_account;
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_pass() {
        return u_pass;
    }

    public void setU_pass(String u_pass) {
        this.u_pass = u_pass;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public String getU_address() {
        return u_address;
    }

    public void setU_address(String u_address) {
        this.u_address = u_address;
    }


    public String getU_account() {
        return u_account;
    }

    public void setU_account(String u_account) {
        this.u_account = u_account;
    }

    public String getU_schoolTag() {
        return u_schoolTag;
    }

    public void setU_schoolTag(String u_schoolTag) {
        this.u_schoolTag = u_schoolTag;
    }

    public Date getU_timeOfRaduation() {
        return u_timeOfRaduation;
    }

    public void setU_timeOfRaduation(Date u_timeOfRaduation) {
        this.u_timeOfRaduation = u_timeOfRaduation;
    }

    public Integer getU_age() {
        return u_age;
    }

    public void setU_age(Integer u_age) {
        this.u_age = u_age;
    }

    @Override
    public String toString() {
        return "User{" +
                "u_id=" + u_id +
                ", u_name='" + u_name + '\'' +
                ", u_pass='" + u_pass + '\'' +
                ", email=" + email +
                ", u_address='" + u_address + '\'' +
                ", u_age=" + u_age +
                ", u_account='" + u_account + '\'' +
                ", u_schoolTag='" + u_schoolTag + '\'' +
                ", u_timeOfRaduation=" + u_timeOfRaduation +
                '}';
    }
}
