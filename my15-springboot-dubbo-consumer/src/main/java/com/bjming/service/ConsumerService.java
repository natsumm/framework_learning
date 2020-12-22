package com.bjming.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bjming.vo.Student;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    /**
     * 消费者一端使用@Reference, 注意注解的包名
     * 配置, interfaceClass接口名, version版本, check启动时是否检查提供者;
     */
    @Reference(interfaceClass = StudentService.class, version = "1.0", check = false)
    private StudentService studentService;


    public Student getStudent(String id) {
        System.out.println("studentService的类型 = " + studentService.getClass().getName());
        return studentService.getStudentById(id);
    }
}
