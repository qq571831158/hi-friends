package com.hifriends.service.impl;

import com.hifriends.beans.Userinfo.UserRegistIBean;
import com.hifriends.dao.IUserDAO;
import com.hifriends.dao.IUserpoolDAO;
import com.hifriends.dao.impl.EmailCodeDAOImpl;
import com.hifriends.model.EmailCode;
import com.hifriends.model.Userinfo;
import com.hifriends.model.Userpool;
import com.hifriends.service.IUserService;
import com.hifriends.utils.BeanConverter;
import com.hifriends.utils.MD5Util;
import com.hifriends.utils.MyUtils;
import com.hifriends.utils.SendEmail;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

/**
 * Created by apple on 2017/7/16.
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDAO userDAO;
    @Autowired
    private IUserpoolDAO userpoolDAO;

    @Autowired
    private EmailCodeDAOImpl emailCodeDAO;

    public int insertSelective(Userinfo userinfo) {
        return this.userDAO.insertSelective(userinfo);
    }

    public Userinfo selectByPrimaryKey(String username) {
        return this.userDAO.selectByPrimaryKey(username);
    }

    public int updateLastLogin(Userinfo record) {
        return userDAO.updateLastLogin(record);
    }

    public int updateActiveStatusByUsername(String username){
        return userDAO.updateActiveStatusByUsername(username);
    }
    public int updateByPrimaryKey(Userinfo record) {
        return 0;
    }

    public boolean isUsernameExist(String username){
        return userDAO.selectByPrimaryKey(username)!=null;
    }

    public int updateByPrimaryKeySelective(Userinfo record) {
        return 0;
    }

    /**
     * 用户登录时，创建session，存入数据库
     * @param username  用户名
     * @return  创建的sessionId
     */
    public String createSessionID(String username){
        //读取配置文件中的session有效时长
        Properties pps = new Properties();
        try {
            InputStream in = getClass().getResourceAsStream("/common.properties");
            pps.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        long vaild = Long.parseLong(pps.getProperty("session.validtime"));
        String sessiond = MD5Util.encode2hex("hi-friends"+username+new Date());
        long currentTime = System.currentTimeMillis() ;
        currentTime+=vaild;
        Userpool userpool = new Userpool();
        userpool.setUsername(username);
        userpool.setIsUsed(0);
        userpool.setSessionId(sessiond);
        userpool.setValidTime(new Timestamp(currentTime));
        this.userpoolDAO.insertSelective(userpool);
        return sessiond;
    }


    public void processregister(UserRegistIBean iBean){
        ///邮件的内容
        String code=MD5Util.encode2hex(new Date()+"hifriends"+iBean.getEmail()+MyUtils.randCode6());
        StringBuffer sb=new StringBuffer("点击下面链接激活账号，48小时生效，否则重新注册账号，链接只能使用一次，请尽快激活！</br>");
        sb.append("<a href=\"http://www.piaoxuehua.cn/hi-friends/user/vaildemail?activeCode=");
        sb.append(code);
        sb.append("&username=");
        sb.append(iBean.getUsername());
        sb.append("\">http://www.piaoxuehua.cn/hi-friends/user/vaildemail?activeCode=");
        sb.append(code);
        sb.append("&username=");
        sb.append(iBean.getUsername());

        sb.append("</a>");
        //发送邮件
        SendEmail sendEmail = new SendEmail();
        sendEmail.sendText(iBean.getEmail(), sb.toString());
        emailCodeDAO.insertSelective(BeanConverter.userRegistIBean2EmailCode(iBean,code));
        System.out.println("发送邮件");
    }


}
