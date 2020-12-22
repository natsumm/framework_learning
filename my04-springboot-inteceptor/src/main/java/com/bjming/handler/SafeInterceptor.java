package com.bjming.handler;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SafeInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        System.out.println("自定义拦截器启动了" + request.getServletPath());
        //HttpServletResponse的方法获取输出流的方法, 在同一次请求中, 只能被获取一次, 多于一次只会输出第一次被获取时输出的内容, 而且会报错;
        /*response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        out.print("自定义拦截器启动");
        out.flush();*/
        return true;
    }
}
