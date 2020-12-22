package com.bjming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 使用容器
 */
@SpringBootApplication
public class My03SpringbootContainerApplication2 {

    public static void main(String[] args) {
        //SpringApplication.run(My03SpringbootContainerApplication.class, args);

        /**
         * 使用run方法时的返回值时容器对象ApplicationCont接口的子接口类型
         * 可以直接获取容器对象
         */
        ConfigurableApplicationContext ctx = SpringApplication.run(My03SpringbootContainerApplication2.class, args);
    }

}
