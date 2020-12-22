package com.bjming.config;

import com.bjming.handler.SafeInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SystemConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册拦截器, 拦截路径和排除路径可以设置多个; , 也可以注册多个拦截器;
        registry.addInterceptor(new SafeInterceptor()).
                addPathPatterns("/user/**").
                excludePathPatterns("/user/sayHello");
    }
}