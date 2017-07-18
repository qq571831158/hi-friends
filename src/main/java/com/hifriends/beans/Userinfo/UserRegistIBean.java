package com.hifriends.beans.Userinfo;

/**
 * Created by apple on 2017/7/17.
 */
public class UserRegistIBean {
    private String username;
    private String password;
    private String nickname;
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserRegistIBean(){}

    public UserRegistIBean(String username, String password, String email,String nickname) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.nickname = nickname;
    }
}
