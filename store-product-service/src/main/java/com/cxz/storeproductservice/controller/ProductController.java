package com.cxz.storeproductservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/hotList")
    public String list(){

        return null;
    }

    @RequestMapping("/search")
    public String search(){
        return null;
    }

    @RequestMapping("/info")
    public String info(){
        return null;
    }
}
