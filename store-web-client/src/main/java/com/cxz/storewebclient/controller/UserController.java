package com.cxz.storewebclient.controller;

import com.alibaba.fastjson.JSONArray;
import com.cxz.storewebclient.api.UserApi;
import com.cxz.storewebclient.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserApi userApi;

    @RequestMapping("/login")
    public ModelAndView login(String account, String password, HttpSession session){

        ModelAndView modelAndView = new ModelAndView();

        User user = new User();
        user.setUserPhone(account);
        user.setUserPassword(password);

        String userJson = JSONArray.toJSONString(user);

        String returnJson = userApi.login(userJson);

        User returnUser = JSONArray.parseObject(returnJson,User.class);

        if (returnUser == null){
            modelAndView.setViewName("login");
            modelAndView.addObject("message","登录失败了！请检查用户名和密码！");
            return modelAndView;
        }

        modelAndView.setViewName("index");
        session.setAttribute("user",returnUser);
        return modelAndView;
    }
}
