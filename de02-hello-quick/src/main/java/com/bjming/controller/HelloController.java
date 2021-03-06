package com.bjming.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 2020/12/14 by AshenOne
 */
//@RestController
public class HelloController {
    @Value("${person.name}")
    private String name;

    @RequestMapping("/sayHello")
    public String sayHello() {
        return "Hello, " + name;
    }
}


