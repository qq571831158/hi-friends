package com.hifriends.model;

import java.util.Date;

public class EmailCode {
    private Integer id;

    private String username;

    private String email;

    private String code;

    private Integer isExipired;

    private Integer isTimeline;

    private Date createTime;

    public EmailCode(Integer id, String username, String email, String code, Integer isExipired, Integer isTimeline, Date createTime) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.code = code;
        this.isExipired = isExipired;
        this.isTimeline = isTimeline;
        this.createTime = createTime;
    }

    public EmailCode() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getIsExipired() {
        return isExipired;
    }

    public void setIsExipired(Integer isExipired) {
        this.isExipired = isExipired;
    }

    public Integer getIsTimeline() {
        return isTimeline;
    }

    public void setIsTimeline(Integer isTimeline) {
        this.isTimeline = isTimeline;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}