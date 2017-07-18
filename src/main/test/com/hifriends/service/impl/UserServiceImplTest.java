package com.hifriends.service.impl;

import com.hifriends.dao.IUserDAO;
import com.hifriends.model.Userinfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by apple on 2017/7/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:beans.xml",
        "classpath*:dispatcher-servlet.xml"
})
public class UserServiceImplTest {
    @Autowired
    private IUserDAO userDAO;

    @Test
    public void selectOne() throws Exception {
        Userinfo userinfo = userDAO.selectByPrimaryKey("11");
        System.out.println(userinfo);
    }

    @Test
    public void createSessionID() throws Exception {
        userDAO.updateActiveStatusByUsername("wang");
    }

}