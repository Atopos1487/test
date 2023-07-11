package com.kkb.filter;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Description 登录拦截器
 */
public class LoginIntercepter implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        String servletPath = request.getServletPath();

        //禁止浏览器使用缓存，防止退出登录后后退回页面
        response.setDateHeader("Expires", 0);
        response.setHeader("Cache-Control", "no-cache, no-store");
        response.setHeader("Pragma", "no-cache");

        if (session.getAttribute("loginSession") != null || servletPath.contains("login")) {
            return true;
        } else {
            response.sendRedirect("/pages/login.html");
            return false;
        }
    }
}
