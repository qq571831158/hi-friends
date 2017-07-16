package com.hifriends.service;

import com.hifriends.model.Userinfo;

/**
 * Created by apple on 2017/7/16.
 */
public interface IUserService {
    void delete(String username);

    void insert(Userinfo record);


    Userinfo selectOne(String username);


    void updateOne(Userinfo userinfo);
}
