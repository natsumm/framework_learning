package com.bjming;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.bjming.service.ConsumerService;
import com.bjming.vo.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDubboConfiguration
public class My15SpringbootDubboConsumerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(My15SpringbootDubboConsumerApplication.class, args);

        ConsumerService cs = ctx.getBean(ConsumerService.class);
        Student student = cs.getStudent("1");
        System.out.println("==>student = " + student);
    }

}
