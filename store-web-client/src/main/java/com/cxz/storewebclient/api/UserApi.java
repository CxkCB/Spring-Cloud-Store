package com.cxz.storewebclient.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author 陈学泽
 * @Description 用户服务API
 * @Date 11:28 2021/5/14
 **/

@FeignClient("user-service")
public interface UserApi {

//    登录方法
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    String login(@RequestParam String userJson);

}
