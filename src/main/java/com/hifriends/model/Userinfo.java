package com.hifriends.model;

import java.util.Date;

public class Userinfo {
    private String username;

    private Integer id;

    private String password;

    private String nickname;

    private String userPicture;

    private Date registTime;

    private Date lastLogin;

    private Integer isActive;

    private String eMail;

    public Userinfo(String username, Integer id, String password, String nickname, String userPicture, Date registTime, Date lastLogin, Integer isActive, String eMail) {
        this.username = username;
        this.id = id;
        this.password = password;
        this.nickname = nickname;
        this.userPicture = userPicture;
        this.registTime = registTime;
        this.lastLogin = lastLogin;
        this.isActive = isActive;
        this.eMail = eMail;
    }
    public Userinfo(Date lastLogin,String username){
        this.lastLogin = lastLogin;
        this.username = username;
    }
    public Userinfo() {
        super();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getUserPicture() {
        return userPicture;
    }

    public void setUserPicture(String userPicture) {
        this.userPicture = userPicture == null ? null : userPicture.trim();
    }

    public Date getRegistTime() {
        return registTime;
    }

    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return this.getUserPicture() + this.getUsername() + this.getNickname()+this.geteMail();
    }
}