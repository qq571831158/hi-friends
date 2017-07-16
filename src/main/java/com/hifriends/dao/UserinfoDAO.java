package com.hifriends.dao;

import com.hifriends.model.Userinfo;

/**
 * Created by apple on 2017/7/16.
 */
public interface UserinfoDAO {
    Userinfo selectOne(String username);

    void insert(Userinfo userinfo);

    void updateOne(Userinfo userinfo);

    void delete(String username);

}
