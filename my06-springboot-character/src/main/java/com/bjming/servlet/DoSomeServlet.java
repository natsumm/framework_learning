package com.bjming.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DoSomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("DoSomeServlet的doPost方法执行了==");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.print("这里是中文内容,是否乱码? hello?");
        out.print("使用spring自己的字符解析过滤器");
        out.flush();
    }
}
