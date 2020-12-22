package com.bjming.config;

import com.bjming.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration: 告诉当前类是一个配置类, 用来替代之前Spring的配置文件
 * <p>
 * 之前在配置文件中使用<bean></bean>标签来添加组件
 * <p>
 * 2020/12/14 by AshenOne
 */
@Configuration
public class MyAppConfig {

    //@Bean注解作用: 将标注的方法返回值添加到容器中, bean的id默认就是方法名helloService
    @Bean
    public HelloService helloService01() {
        return new HelloService();
    }
}


