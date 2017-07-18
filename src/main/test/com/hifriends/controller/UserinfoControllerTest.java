package com.hifriends.controller;

import com.hifriends.beans.Userinfo.UserRegistIBean;
import com.hifriends.dao.IEmailCodeDAO;
import com.hifriends.model.EmailCode;
import com.hifriends.service.IUserService;
import com.hifriends.utils.MD5Util;
import com.hifriends.utils.MyUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by apple on 2017/7/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:beans.xml",
        "classpath*:dispatcher-servlet.xml"
})
public class UserinfoControllerTest {
    @Autowired
    private IUserService userService;

    @Autowired
    private IEmailCodeDAO emailCodeDAO;
    @Test
    public void testSelectOne(){
        System.out.println(userService.selectByPrimaryKey("cheng"));
    }

    @Test
    public void testSession(){
        System.out.println(userService.createSessionID("cheng"));
    }
    @Test
    public void testUsernameExist(){
        System.out.println(userService.isUsernameExist("cheng"));
    }

    @Test
    public void textProcessregister() throws Exception {
//        UserRegistIBean userRegistIBean = new UserRegistIBean();
//        userRegistIBean.setEmail("571831158@qq.com");
//        userRegistIBean.setPassword("sdasd");
//        userRegistIBean.setNickname("sa是哒");
//        userRegistIBean.setUsername("cccc");
//        userService.processregister(userRegistIBean);
        EmailCode emailCode = emailCodeDAO.selectByUsername("cccc");
        System.out.println(emailCode.getCode());
    }

}