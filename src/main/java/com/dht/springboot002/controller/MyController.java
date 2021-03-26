package com.dht.springboot002.controller;

import com.dht.springboot002.entity.TestUser;
import com.dht.springboot002.response.ResponseData;
import com.dht.springboot002.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

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

    @RequestMapping(value = "/createUser",produces ="application/json")
    @ResponseBody
    public ResponseData createUser(@RequestBody Map<String,Object> params ) {
        if ("".equals(params.get("name").toString()) || params.get("name").toString() == null){
            return new ResponseData(500,"添加失败--数据为空");
        }
        TestUser testUser = new TestUser();
        testUser.setName(params.get("name").toString());
        testUser.setAge(Integer.parseInt(String.valueOf(params.get("age"))));
        testUser.setPhone(params.get("phone").toString());
        testUser.setAddress(params.get("address").toString());

        int result = userService.addUser(testUser);
        if (result > 0) {
           return new ResponseData(200,"添加成功");
        }
           return new ResponseData(500,"添加失败");
    }
}
