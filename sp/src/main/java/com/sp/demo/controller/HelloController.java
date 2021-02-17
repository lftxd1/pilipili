package com.sp.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String sayHello(){
        return "index";
    }

    @RequestMapping("/player")
    public String player(){
        return "player";
    }
}
