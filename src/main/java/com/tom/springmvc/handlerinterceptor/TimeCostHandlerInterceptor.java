package com.tom.springmvc.handlerinterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName TimeCostHandlerInterceptor.java
 * @Description TODO
 * @createTime 2024年10月01日 10:55:00
 */
public class TimeCostHandlerInterceptor implements HandlerInterceptor {

    public TimeCostHandlerInterceptor() {
        System.out.println("TimeCostHandlerInterceptor constructed");
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        request.setAttribute("startTime" , System.currentTimeMillis());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        Long startTime = (Long) request.getAttribute("startTime");
        System.out.println(request.getServletPath() + " 执行耗时统计（单位毫秒）=" + (System.currentTimeMillis() - startTime));
    }
}
