package com.cxz.storewebclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author 陈学泽
 * @Description 重定向处理程序
 * @Date 11:36 2021/5/14
 * @Package com.cxz.storewebclient.controller
 * @name RedirectHandler
 **/

@Controller
public class RedirectHandler {

    @GetMapping("/{url}")
    public String redirect(@PathVariable("url") String url){return url;}
}
