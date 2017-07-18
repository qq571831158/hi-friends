package com.hifriends.service;

import com.hifriends.model.EmailCode;

/**
 * Created by apple on 2017/7/17.
 */
public interface IEmailCodeService {
    EmailCode selectActiveCode(String username);
}
