package com.bjming.config;

import com.bjming.web.filter.LoginFilter;
import com.bjming.web.servlet.LoginServlet;
import com.bjming.web.servlet.TestServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import javax.servlet.Servlet;

@Configuration
public class SystemConfig {

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        //注册过滤器的方法
        FilterRegistrationBean<Filter> reg = new FilterRegistrationBean<>();
        reg.setFilter(new LoginFilter());
        //注意过滤器是servlet的技术, 一个*就表示目录及子目录
        //拦截器是spring, webmvc的技术, **表示目录及子目录, 注意区分
        reg.addUrlPatterns("/user/*"); //表示过滤所有user开头的请求url
        return reg;
    }

    /**
     * 使用第一种方式注册servlet对象, 并设置url, 相当于在web.xml文件中的配置
     * 使用set方法, 然后添加url
     *
     * @return
     */
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        ServletRegistrationBean<Servlet> reg = new ServletRegistrationBean<>();
        reg.setServlet(new TestServlet());
        reg.addUrlMappings("/test");
        return reg;
    }

    /**
     * 直接在ServletRegistrationBean的构造方法中注册LoginServlet,
     * 并使其被过滤器过滤一次
     */
    @Bean
    public ServletRegistrationBean servletRegistrationBean1() {
        ServletRegistrationBean reg = new ServletRegistrationBean(new LoginServlet(), "/user/login");
        return reg;
    }
}
