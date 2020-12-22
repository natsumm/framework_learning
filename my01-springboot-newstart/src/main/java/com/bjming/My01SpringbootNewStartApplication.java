package com.bjming;

import com.bjming.vo.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class My01SpringbootNewStartApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(My01SpringbootNewStartApplication.class, args);
        Student student = (Student) ctx.getBean("student");
        System.out.println("student-->" + student);
    }

}
