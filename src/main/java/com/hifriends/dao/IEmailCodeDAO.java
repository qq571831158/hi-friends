package com.hifriends.dao;

import com.hifriends.model.EmailCode;

/**
 * Created by apple on 2017/7/18.
 */
public interface IEmailCodeDAO extends IBaseDAO<EmailCode> {
    EmailCode selectByUsername(String username);
}
