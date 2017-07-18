package com.hifriends.utils;

import com.hifriends.beans.Userinfo.UserRegistIBean;
import com.hifriends.model.EmailCode;
import com.hifriends.model.Userinfo;

/**
 * Created by apple on 2017/7/18.
 */
public class BeanConverter {
    public static Userinfo userRegistIBean2Userinfo(UserRegistIBean userRegistIBean){
        Userinfo userinfo = new Userinfo();
        userinfo.setUsername(userRegistIBean.getUsername());
        userinfo.setPassword(userRegistIBean.getPassword());
        userinfo.seteMail(userRegistIBean.getEmail());
        userinfo.setNickname(userRegistIBean.getNickname());
        userinfo.setIsActive(0);
        return userinfo;
    }

    public static EmailCode userRegistIBean2EmailCode(UserRegistIBean userRegistIBean,String code){
        EmailCode emailCode = new EmailCode();
        emailCode.setUsername(userRegistIBean.getUsername());
        emailCode.setEmail(userRegistIBean.getEmail());
        emailCode.setIsExipired(0);
        emailCode.setCode(code);
        emailCode.setIsTimeline(0);
        return emailCode;
    }
}
