package com.hifriends.service;

import com.hifriends.beans.Userinfo.UserRegistIBean;
import com.hifriends.model.EmailCode;
import com.hifriends.model.Userinfo;

/**
 * Created by apple on 2017/7/16.
 */
public interface IUserService {

    int insertSelective(Userinfo userinfo);

    Userinfo selectByPrimaryKey(String username);

    String createSessionID(String username);

    boolean isUsernameExist(String username);

    int updateLastLogin(Userinfo record);

    void processregister(UserRegistIBean iBean);

    int updateActiveStatusByUsername(String username);

    //    int deleteByPrimaryKey(String username);
//
//    int insert(Userinfo record);
//
//    int insertSelective(Userinfo record);
//
//    Userinfo selectByPrimaryKey(String username);
//
    int updateByPrimaryKeySelective(Userinfo record);

    int updateByPrimaryKey(Userinfo record);


}
