package com.bjming.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController = @Controller + @ResponseBody,
 * 表示这个类的所有方法的返回值, 都直接返回给浏览器, 如果是对象, 就转换为json数据格式
 * 此后这个类中的所有方法, 都不需要再写@ResponseBody注解, 都默认返回给浏览器
 * Author: AshenOne
 * Time: 12/03/2020 8:50
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello My Friend";
    }
}


