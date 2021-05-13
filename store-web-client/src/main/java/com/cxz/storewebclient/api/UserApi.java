package com.cxz.storewebclient.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("user-service")
public interface UserApi {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    String login(@RequestParam String userJson);

}
