package com.cxz.storewebclient.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.cxz.storewebclient.api.UserApi;
import com.cxz.storewebclient.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    UserApi userApi;

    @Test
    public void test(){

        User user = new User();

        user.setUserPhone("15364273635");

        user.setUserPassword("123456789");

        String returnJson = userApi.login(JSONArray.toJSONString(user));

        User returnUser = JSONArray.parseObject(returnJson,User.class);

        System.out.println(returnUser.toString());
    }
}
