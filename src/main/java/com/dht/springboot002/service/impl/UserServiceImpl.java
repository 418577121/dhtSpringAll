package com.dht.springboot002.service.impl;

import com.dht.springboot002.mapper.UserMapper;
import com.dht.springboot002.entity.TestUser;
import com.dht.springboot002.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<TestUser> findAllUser() {
        return userMapper.selectAllUser();
    }

    @Override
    public int addUser(TestUser testUser) {
        return userMapper.insertUser(testUser);
    }
}
