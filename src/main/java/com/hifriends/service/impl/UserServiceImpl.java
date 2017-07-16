package com.hifriends.service.impl;

import com.hifriends.dao.UserinfoDAO;
import com.hifriends.model.Userinfo;
import com.hifriends.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by apple on 2017/7/16.
 */
@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    private UserinfoDAO userinfoDAO;

    public void delete(String username) {
        this.userinfoDAO.delete(username);
    }

    public void insert(Userinfo record) {

    }

    public Userinfo selectOne(String username) {
        return this.userinfoDAO.selectOne(username);
    }

    public void updateOne(Userinfo userinfo) {

    }
}
