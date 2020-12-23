package com.bjming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 注意SpringBoot中有Jsp文件打包时的特殊要求:
 * 打包时一定要使主类继承SpringBootServletInitializer,
 * 重写configure()方法, 使得jsp与servlet建立关系
 */
@SpringBootApplication
public class My16SpringbootWarApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(My16SpringbootWarApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(My16SpringbootWarApplication.class);
    }
}
