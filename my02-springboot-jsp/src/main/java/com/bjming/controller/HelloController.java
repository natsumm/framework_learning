package com.bjming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
public class HelloController {

    @RequestMapping("/toIndex")
    public String toIndex(HttpServletRequest request) {
        System.out.println("toIndex()方法执行了, 即将跳转页面");

        request.setAttribute("data", new Date() + "这里是springboot");
        //跳转页面
        return "index";
    }
}
