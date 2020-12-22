package com.bjming.tx.controller;

import com.bjming.tx.domain.Student;
import com.bjming.tx.service.StudentService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StudentController {
    @Resource
    private StudentService studentService;

    /**
     * 使用post请求添加数据
     *
     * @PathVariable: 指定Restful接口风格的url中的参数名
     */
    @PostMapping("/student/{name}/{age}")
    public Object addStudent(@PathVariable(value = "name") String name,
                             @PathVariable(value = "age") Integer age) {

        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        int rows = studentService.addStudent(student);
        System.out.println("返回行数rows = " + rows);

        return rows == 1 ? "成功" : "失败";
    }
}
