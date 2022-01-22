package com.chd.listerner;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

import java.io.IOException;

/**
 * @Author Big_Sea
 * @Date 2022/1/12 22:11
 * @Version 1.0
 */
public class OnlineCount implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        ServletContext servletContext = se.getSession().getServletContext();
        Integer onlinecounts = (Integer)servletContext.getAttribute("Onlinecounts");

    if (onlinecounts == null) {
      onlinecounts=new Integer(1);
    } else {
        int count = onlinecounts.intValue();
        onlinecounts=new Integer(onlinecounts++);

    }
    servletContext.setAttribute("在线人数",onlinecounts);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        ServletContext servletContext = se.getSession().getServletContext();
        Integer onlinecounts = (Integer)servletContext.getAttribute("Onlinecounts");

        if (onlinecounts == null) {
            onlinecounts=new Integer(0);
        } else {
            int count = onlinecounts.intValue();
            onlinecounts=new Integer(onlinecounts--);

        }
        servletContext.setAttribute("在线人数",onlinecounts);
    }
}
