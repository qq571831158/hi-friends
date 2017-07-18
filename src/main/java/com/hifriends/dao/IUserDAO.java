package com.hifriends.dao;

import com.hifriends.model.Userinfo;

import java.util.Date;

/**
 * Created by apple on 2017/7/18.
 */
public interface IUserDAO extends IBaseDAO<Userinfo> {

    int updateLastLogin(Userinfo userinfo);

    int updateActiveStatusByUsername(String username);
//    int deleteByPrimaryKey(String username);
//
//    int insert(Userinfo record);
//
//    int insertSelective(Userinfo record);
//
//    Userinfo selectByPrimaryKey(String username);
//
//    int updateByPrimaryKeySelective(Userinfo record);
//
//    int updateByPrimaryKey(Userinfo record);
}
