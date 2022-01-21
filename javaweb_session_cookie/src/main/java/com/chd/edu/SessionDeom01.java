package com.chd.edu;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * @Author Big_Sea
 * @Date 2022/1/12 10:06
 * @Version 1.0
 */
public class SessionDeom01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //解决乱码
        req.setCharacterEncoding("Utf-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("txet/html;charest=utf-8");
        //获得session
        HttpSession session = req.getSession();
        session.setAttribute("name","姜旭海");
        String id = session.getId();
        //判断session是不是新创建的
        if(session.isNew()){
            resp.getWriter().write("已经创建成功"+id);
        }else {
            resp.getWriter().write("之前就在服务器"+id);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
