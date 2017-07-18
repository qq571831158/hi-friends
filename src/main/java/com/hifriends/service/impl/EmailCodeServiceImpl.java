package com.hifriends.service.impl;

import com.hifriends.dao.IEmailCodeDAO;
import com.hifriends.model.EmailCode;
import com.hifriends.service.IEmailCodeService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by apple on 2017/7/17.
 */
public class EmailCodeServiceImpl implements IEmailCodeService {
    @Autowired
    private IEmailCodeDAO emailCodeDAO;
    public EmailCode selectActiveCode(String username){
        return emailCodeDAO.selectByUsername(username);
    }
}
