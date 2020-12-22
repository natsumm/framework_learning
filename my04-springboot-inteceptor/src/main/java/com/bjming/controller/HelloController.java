package com.bjming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/user/sayHello")
    @ResponseBody
    public String sayHello() {
        System.out.println("sayHello方法执行");
        return "user/sayHello中文内容";
    }

    @RequestMapping("/user/toSave")
    @ResponseBody
    public String toSave() {
        return "toSave中文内容";
    }
}
