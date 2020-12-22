package com.bjming.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/sayHello", produces = "text/html;charset=utf-8")
    public String sayHello() {
        return "hello my friend !! 赞美太阳";
    }
}
