package com.hifriends.controller;

import com.hifriends.beans.OBeanBase;
import com.hifriends.beans.Userinfo.UserLoginIBean;
import com.hifriends.beans.Userinfo.UserLoginOBean;
import com.hifriends.beans.Userinfo.UserRegistIBean;
import com.hifriends.dao.IEmailCodeDAO;
import com.hifriends.model.EmailCode;
import com.hifriends.model.Userinfo;
import com.hifriends.service.IUserService;
import com.hifriends.utils.BeanConverter;
import com.hifriends.utils.MyUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by apple on 2017/7/16.
 */

@Controller
@RequestMapping(value = "/user")
public class UserinfoController {
    private Logger logger = Logger.getLogger("controller");

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private IUserService userService;
    @Autowired
    private IEmailCodeDAO emailCodeDAO;

    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public OBeanBase doLogin(@RequestBody UserLoginIBean userLoginIBean) {
        OBeanBase carrier = new OBeanBase();
        if (!checkDataIsNull(userLoginIBean)) {
            Userinfo getUser = userService.selectByPrimaryKey(userLoginIBean.getUsername());
            if (getUser != null) {
                System.out.println(getUser);
                if (getUser.getPassword().equals(userLoginIBean.getPassword())) {
                    if (getUser.getIsActive() == 1) {
                        userService.updateLastLogin(new Userinfo(new Date(), userLoginIBean.getUsername()));
                        carrier.serInfo("S01", "登录成功");
                        String sessionId = userService.createSessionID(userLoginIBean.getUsername());
                        logger.info(new Date() + "         " + "用户" + userLoginIBean.getUsername() + "从" + MyUtils.getIp(request) + "登录成功");
                        carrier.setContents(new UserLoginOBean(getUser.getNickname(), getUser.getUserPicture(), sessionId));
                    } else {
                        carrier.serInfo("E04", "账号未激活");
                    }
                } else {
                    carrier.serInfo("E02", "密码错误");
                }
            } else {
                carrier.serInfo("E01", "无此用户");
            }
        } else {
            carrier.serInfo("E03", "参数为空！");
        }
        return carrier;
    }


    @RequestMapping(value = "regist", method = RequestMethod.POST)
    @ResponseBody
    public OBeanBase regist(@RequestBody UserRegistIBean registIBean) {
        OBeanBase carrier = new OBeanBase();
        if (!checkDataIsNull(registIBean)) {
            if (!userService.isUsernameExist(registIBean.getUsername())) {
                int i = userService.insertSelective(BeanConverter.userRegistIBean2Userinfo(registIBean));
                if (i == 1) {
                    userService.processregister(registIBean);
                    carrier.serInfo("S01", "注册成功");
                } else {
                    carrier.serInfo("E02", "注册失败，请稍后再试");
                }
            } else {
                carrier.serInfo("E03", "用户名已存在！");
            }
        } else {
            carrier.serInfo("E01", "参数为空");
        }
        return carrier;
    }

    @RequestMapping(value = "isusernameexist", method = RequestMethod.GET)
    @ResponseBody
    public OBeanBase isUsernameExist(@RequestParam("username") String username) {
        OBeanBase carrier = new OBeanBase();
        if (!userService.isUsernameExist(username)) {
            carrier.serInfo("S01", "用户名不存在");
        } else {
            carrier.serInfo("E01", "用户名已存在");
        }
        return carrier;
    }

    @RequestMapping(value = "vaildemail",method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView validemail(@RequestParam("activeCode") String activeCode, @RequestParam("username") String username) {
        ModelAndView modelAndView;
        EmailCode emailCode = emailCodeDAO.selectByUsername(username);
        if (emailCode!=null){
            if(emailCode.getCode().equals(activeCode)){
                userService.updateActiveStatusByUsername(username);
                modelAndView = new ModelAndView("regist_success");
            }else {
                modelAndView = new ModelAndView("regist_fail","msg","验证码错误");
            }
        }else {
            modelAndView = new ModelAndView("regist_fail","msg","您还没有注册，请先注册");
        }
        return modelAndView;
    }

    private static boolean checkDataIsNull(Object data) {
        return data == null;
    }
}
