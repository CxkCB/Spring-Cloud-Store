package com.cxz.storewebclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author 陈学泽
 * @Description 首页控制器
 * @Date 11:37 2021/5/14
 * @Package com.cxz.storewebclient.controller
 * @name HomeController
 **/

@Controller
public class HomeController {

//    首页商品显示处理
    @RequestMapping("/")
    public ModelAndView home(){
        
        
        
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

}
