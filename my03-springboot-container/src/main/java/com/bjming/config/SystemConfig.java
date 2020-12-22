package com.bjming.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Date;

@Configuration
public class SystemConfig implements CommandLineRunner {
    /**
     * 希望容器创建时执行一段功能代码,
     * 就可以实现CommandLineRunner或者ApplicationRunner接口中的run方法
     * 将希望容器创建时执行的代码放入run方法中执行
     * 注意: 这个CommandLineRunner或者ApplicationRunner接口的实现类必须放入容器中才能起作用;
     */
    @Override
    public void run(String... args) throws Exception {
        System.out.println("这个方法会在容器创建完毕后执行 == " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date()));
    }
}
