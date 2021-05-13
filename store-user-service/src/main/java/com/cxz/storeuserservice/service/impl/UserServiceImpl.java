package com.cxz.storeuserservice.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cxz.storeuserservice.entity.User;
import com.cxz.storeuserservice.mapper.UserMapper;
import com.cxz.storeuserservice.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
