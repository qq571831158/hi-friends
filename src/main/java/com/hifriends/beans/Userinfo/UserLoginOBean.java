package com.hifriends.beans.Userinfo;

/**
 * Created by apple on 2017/7/16.
 */
public class UserLoginOBean {
    private String nickname;
    private String userPicture;

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
    public UserLoginOBean(){

    }

    public UserLoginOBean(String nickname, String userPicture) {
        this.nickname = nickname;
        this.userPicture = userPicture;
    }
}
