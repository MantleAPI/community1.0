package com.test.community.community.controller;

import com.test.community.community.entity.Hello;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public Hello getHello(Hello hello){
        return hello;
    }
}
