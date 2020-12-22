package com.bjming;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class My14SpringbootDubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(My14SpringbootDubboProviderApplication.class, args);
    }

}
