package com.bjming.config;

import com.bjming.servlet.HelloServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SystemConfig {

    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        //servlet注册类
        ServletRegistrationBean reg = new ServletRegistrationBean();
        reg.setServlet(new HelloServlet());
        reg.addUrlMappings("/hello");
        return reg;
    }
}
