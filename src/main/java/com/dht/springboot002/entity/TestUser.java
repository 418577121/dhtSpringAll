package com.dht.springboot002.entity;

import lombok.Data;

@Data
public class TestUser {
    private Integer id;
    private String name;
    private Integer age;
    private String address;
    private String phone;

    @Override
    public String toString() {
        return "TestUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
