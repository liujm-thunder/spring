package com.mengshao.servlet;

import com.mengshao.servlet.service.HelloService;
import com.mengshao.servlet.service.impl.HelloServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    private HelloService helloService = new HelloServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> all = helloService.findAll();
        resp.setContentType("application/json;charset=UTF-8");
        resp.getWriter().write(all.toString());
    }
}
