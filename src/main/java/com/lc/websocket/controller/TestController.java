package com.lc.websocket.controller;

import com.lc.websocket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testController")
@SuppressWarnings("all")
public class TestController {

    @Autowired
    private UserService userService;


    @RequestMapping("/test")
    public Object test(){
        return userService.selectAllUser();
    }

    @RequestMapping("/testData")
    public String testData(){
        return "sssss";
    }

}
