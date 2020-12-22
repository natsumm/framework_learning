package com.bjming.config;

import com.bjming.servlet.DoSomeServlet;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CharacterEncodingFilter;

@SpringBootConfiguration
public class SystemConfig {
    /**
     * 默认情况下, springboot会开启一个自己的字符解析过滤器, 如果用户也使用了一个字符解析过滤器, 默认不会使用
     * 如果需要使用用户自己的字符解析过滤器, 需要在配置文件中显式的关闭默认的字符解析过滤器
     * server.servlet.encoding.enabled=false;然后springboot就会使用用户自己注册的CharacterEncodingFilter了
     * 这种方式更加灵活
     * <p>
     * 但是springboot既然默认启动了字符解析过滤器, 我们对springboot可以进行设置, 设置正确的字符集就更加方便了
     */
//    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean reg = new FilterRegistrationBean();
        //创建字符解析过滤器, 并设置字符集, 强制request和response对象使用者指定的字符集进行过滤
        CharacterEncodingFilter cef = new CharacterEncodingFilter();
        cef.setEncoding("utf-8");
        cef.setForceEncoding(true);

        //注册过滤器
        reg.setFilter(cef);
        //设置url, 过滤地址, /**表示所有请求
        reg.addUrlPatterns("/*");
        return reg;
    }

    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        System.out.println("servletRegistrationBean()方法被调用了? ");
        //return new ServletRegistrationBean<>(new DoSomeServlet(), "/doSome");

        //By default, if the context contains only a single Servlet, it is mapped to /
        //默认情况下, 当容器中只有一个serlvet时, 它默认的映射路径就是 "/"
        ServletRegistrationBean reg = new ServletRegistrationBean<>();
        reg.setServlet(new DoSomeServlet());
        return reg;
    }
}
