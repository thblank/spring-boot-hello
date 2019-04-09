package com.bee.sample.ch1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class HelloworldController {

    @RequestMapping("/${query.all}.json")
    public @ResponseBody String say(){
        return "Hello world Spring Boot";
    }

    @RequestMapping("/index.html")
    public String sayHello(Model model){
        model.addAttribute("name","hello,world");
        return "/index.btl";
    }


}
