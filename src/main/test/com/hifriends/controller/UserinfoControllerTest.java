package com.hifriends.controller;

import com.hifriends.service.IUserService;
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

    @Test
    public void testSelectOne(){
        System.out.println(userService.selectOne("cheng"));
    }

}