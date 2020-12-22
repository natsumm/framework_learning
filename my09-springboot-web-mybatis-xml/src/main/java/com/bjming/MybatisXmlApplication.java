package com.bjming;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 注意这个主应用的类名不能为SpringBootApplication,
 * 与@SpringBootApplication注解冲突, 导致编译报错;
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.bjming.mapper"})
public class MybatisXmlApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisXmlApplication.class, args);

        //IOException ioe=null;
        //抛出一个null, 最终抛出的时空指针异常, NullPointerException; 
        //throw null;
    }
}