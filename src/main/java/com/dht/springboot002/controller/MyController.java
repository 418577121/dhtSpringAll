package com.dht.springboot002.controller;

import com.dht.springboot002.entity.TestUser;
import com.dht.springboot002.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getbea")
    public String getBea() {
        return "bea";
    }

    @RequestMapping("/getUserInfo")
    public String getUserInfo(Model model) {
        List<TestUser> allUser = userService.findAllUser();
        model.addAttribute("userLists",allUser);
        return "userList";
    }

    @RequestMapping("/test")
    public String test(Model model) {
        model.addAttribute("test","1111111");
        return "test";
    }
}