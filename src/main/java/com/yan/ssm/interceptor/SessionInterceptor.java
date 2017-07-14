package com.yan.ssm.interceptor;

import com.yan.ssm.model.Admin;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by yandeguang on 2017/7/14/0014.
 */
public class SessionInterceptor implements HandlerInterceptor{
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {

        String uri = request.getRequestURI();
        if (uri.indexOf("login")>0){
        return  true;
        }
        HttpSession session = request.getSession();
        Admin admin = (Admin) session.getAttribute("adminInfo");
        if (admin!=null){
            return true;
        }

        request.getRequestDispatcher("/login").forward(request,response);

        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
