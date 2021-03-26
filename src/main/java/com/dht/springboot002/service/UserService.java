package com.dht.springboot002.service;

import com.dht.springboot002.entity.TestUser;

import java.util.List;

public interface UserService {
    List<TestUser> findAllUser();

    int addUser(TestUser testUser);
}
