package com.fxb.spring_boot_one.User.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("UserController")
@Controller
public class UserController {

    @ResponseBody
    @RequestMapping("hello")
    public  String hello(){
        return "HELLO SPRING BOOT";
    }
}
