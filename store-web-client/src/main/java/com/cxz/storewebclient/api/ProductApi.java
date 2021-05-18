package com.cxz.storewebclient.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("product-service")
public interface ProductApi {

    @RequestMapping("/hotList")
    String list();
}
