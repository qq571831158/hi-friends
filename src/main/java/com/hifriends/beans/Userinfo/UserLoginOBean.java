package com.hifriends.beans.Userinfo;

/**
 * Created by apple on 2017/7/16.
 */
public class UserLoginOBean {
    private String nickname;
    private String userPicture;
    private String sessionID;

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

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public UserLoginOBean(){

    }

    public UserLoginOBean(String nickname, String userPicture,String sessionID) {
        this.nickname = nickname;
        this.userPicture = userPicture;
        this.sessionID = sessionID;
    }
}
