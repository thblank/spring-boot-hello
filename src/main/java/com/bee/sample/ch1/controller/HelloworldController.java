package com.bee.sample.ch1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloworldController {

    @RequestMapping("/sayHello.html")
    public @ResponseBody String say(){
        return "Hello Spring Boot";
    }

}
