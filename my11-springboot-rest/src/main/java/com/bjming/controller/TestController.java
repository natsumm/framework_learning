package com.bjming.controller;

import org.springframework.web.bind.annotation.*;

/**
 * 通过注解配置不同的请求方式
 */
@RestController
public class TestController {

    private int stuId;

    @GetMapping("/student/{id}")
    public String getStudent(@PathVariable("id") String id) {
        if ("1".equals(id)) {
            return "编号为: " + id + ",的学生为 张三";
        }

        return "编号为: " + id + ", 的学生为 李四";
    }

    @PostMapping("/student/{name}/{age}")
    public String addStudent(@PathVariable String name, @PathVariable Integer age) {
        return "已经创建编号为: " + (stuId++) + "的学生, 姓名:" + name + ", 年龄: " + age;
    }

    @PutMapping("/student/{name}/{age}")
    public String putStudent(@PathVariable String name, @PathVariable Integer age) {
        return "修改编号为: " + stuId + "的学生, 修改后姓名: " + name + ", 年龄: " + age;
    }

    @DeleteMapping("/student/{id}")
    public String deleteStudentById(@PathVariable String id) {
        return "已经删除编号为" + id + "的学生";
    }
}
