package com.cxz.storewebclient.controller;

import com.alibaba.fastjson.JSONArray;
import com.cxz.storewebclient.api.UserApi;
import com.cxz.storewebclient.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * @Author 陈学泽
 * @Description 用户服务控制器
 * @Date 11:35 2021/5/14
 * @Package com.cxz.storewebclient.controller
 * @name UserController
 **/

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserApi userApi;

/**
 * @Author 陈学泽
 * @Description //TODO 用户登录功能
 * @Date  2021/5/18
 * @Param [account, password, session]
 * @return org.springframework.web.servlet.ModelAndView
 **/
    @RequestMapping("/login")
    public String login(String account, String password, HttpSession session){

//        实现一个用户实体类,并设置用户名和密码
        User user = new User();
        user.setUserPhone(account);
        user.setUserPassword(password);

//        将用户实体类转换为JSON字符串
        String userJson = JSONArray.toJSONString(user);

//        调用用户登录API,返回包含完整用户的JSON字符串
        String returnJson = userApi.login(userJson);

//        将返回的JSON字符串转换为对象
        User returnUser = JSONArray.parseObject(returnJson,User.class);

//        判断返回的对象是否为空
        if (returnUser == null){
//            为空则返回login界面并显示错误信息
            session.setAttribute("message","用户名或密码错误！请重新填写");
            return "login";
        }

//        不为空则将用户信息写入session并返回主页
        session.setAttribute("user",returnUser);
        session.setAttribute("message","登录成功");
        return "redirect:/";
    }
    
    
/**
 * @Author 陈学泽
 * @Description //TODO 用户注销功能
 * @Date  2021/5/18
 * @Param [session]
 * @return java.lang.String
 **/    
    @RequestMapping("/logout")
    public String logout(HttpSession session){
//        从session中移除用户信息
        session.removeAttribute("user");
        return "redirect:/";
    }

/**
 * @Author 陈学泽
 * @Description //TODO 用户注册功能
 * @Date  2021/5/18
 * @Param [account, password, nickname, session]
 * @return java.lang.String
 **/
    @RequestMapping("/register")
    public String register(String account,String password,String nickname,HttpSession session){
        
        return "redirect:/";
    }

}
