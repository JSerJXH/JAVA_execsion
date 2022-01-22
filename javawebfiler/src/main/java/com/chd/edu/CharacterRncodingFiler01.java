package com.chd.edu;

import jakarta.servlet.*;
import java.io.IOException;

/**
 * @Author Big_Sea
 * @Date 2022/1/12 21:10
 * @Version 1.0
 */
public class CharacterRncodingFiler01 implements Filter {


    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("CharacterEncodingFilter初始化");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html，charset=UTF-8");
    System.out.println("执行前");
        chain.doFilter(request,response);
    System.out.println("执行后");
    }

    public void destroy() {
        System.out.println("CharacterEncodingFilter销毁");
    }
}
