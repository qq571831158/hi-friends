package com.hifriends.model;

/**
 * Created by apple on 2017/7/16.
 */

import java.sql.Timestamp;


public class Userinfo {
    private int id;
    private String useranme;
    private String password;
    private String nickname;
    private String userPicture;
    private Timestamp registTime;
    private Timestamp lasgLogin;
    private int isActive;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUseranme() {
        return useranme;
    }

    public void setUseranme(String useranme) {
        this.useranme = useranme;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUserPicture() {
        return userPicture;
    }

    public void setUserPicture(String userPicture) {
        this.userPicture = userPicture;
    }

    public Timestamp getRegistTime() {
        return registTime;
    }

    public void setRegistTime(Timestamp registTime) {
        this.registTime = registTime;
    }

    public Timestamp getLasgLogin() {
        return lasgLogin;
    }

    public void setLasgLogin(Timestamp lasgLogin) {
        this.lasgLogin = lasgLogin;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    public Userinfo(){}

    public Userinfo(int id, String useranme, String password, String nickname, String userPicture, Timestamp registTime, Timestamp lasgLogin, int isActive) {
        this.id = id;
        this.useranme = useranme;
        this.password = password;
        this.nickname = nickname;
        this.userPicture = userPicture;
        this.registTime = registTime;
        this.lasgLogin = lasgLogin;
        this.isActive = isActive;
    }
}
