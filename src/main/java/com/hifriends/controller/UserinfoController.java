package com.hifriends.controller;

import com.hifriends.beans.OBeanBase;
import com.hifriends.beans.Userinfo.UserLoginIBean;
import com.hifriends.beans.Userinfo.UserLoginOBean;
import com.hifriends.model.Userinfo;
import com.hifriends.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by apple on 2017/7/16.
 */

@Controller
@RequestMapping(value = "/user")
public class UserinfoController {
    @Autowired
    private IUserService userService;

    @RequestMapping(value = "login",method = RequestMethod.POST)
    @ResponseBody
    public OBeanBase doLogin(@RequestBody UserLoginIBean userLoginIBean) {
        OBeanBase carrier = new OBeanBase();
        if (!checkDataIsNull(userLoginIBean)) {
            Userinfo getUser = userService.selectOne(userLoginIBean.getUsername());
            if (getUser!=null){
                if (getUser.getPassword().equals(userLoginIBean.getPassword())){
                    carrier.serInfo("S01","登录成功");
                    carrier.setContents(new UserLoginOBean(getUser.getNickname(),getUser.getUserPicture()));
                }
                else {
                    carrier.serInfo("E02","密码错误");
                }
            }else {
                carrier.serInfo("E01","无此用户");
            }

        }
        return carrier;
    }

    private static boolean checkDataIsNull(Object data){
        return data ==null;
    }
}
