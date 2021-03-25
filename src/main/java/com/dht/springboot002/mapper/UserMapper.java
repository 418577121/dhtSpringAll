package com.dht.springboot002.mapper;

import com.dht.springboot002.entity.TestUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
public interface UserMapper {
    List<TestUser>  selectAllUser();
}
