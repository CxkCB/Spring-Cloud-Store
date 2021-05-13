package com.cxz.storeuserservice.controller;

import com.alibaba.fastjson.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @RequestMapping("/login")
    public String login(@RequestParam String userJson){

        Object object = JSONArray.parseObject(userJson);

        return "";
    }
}
