package com.bjming.web.filter;

import javax.servlet.*;
import java.io.IOException;

public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("过滤器的doFilter方法执行了 ==>" + request.getServletContext());

        //过滤器的放行方式
        filterChain.doFilter(request, response);
    }
}
