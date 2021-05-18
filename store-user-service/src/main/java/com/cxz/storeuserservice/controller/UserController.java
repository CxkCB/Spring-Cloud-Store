package com.cxz.storeuserservice.controller;

import com.alibaba.fastjson.JSONArray;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cxz.storeuserservice.entity.User;
import com.cxz.storeuserservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestParam String userJson){

        User user = JSONArray.parseObject(userJson, User.class);

        QueryWrapper queryWrapper = new QueryWrapper();

        queryWrapper.eq("user_phone",user.getUserPhone());
        queryWrapper.eq("user_password",user.getUserPassword());

        User queryUser = userService.getOne(queryWrapper);

        if (queryUser == null){

            return null;

        }

        return JSONArray.toJSONString(queryUser);
    }


}
