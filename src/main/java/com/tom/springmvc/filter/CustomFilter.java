package com.tom.springmvc.filter;

import jakarta.servlet.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName CustomFilter.java
 * @Description 自定义过滤器
 * @createTime 2024年10月01日 12:24:00
 */
@Component
public class CustomFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println(request.getServletContext().getContextPath() + " CustomFilter 过滤器执行");
        chain.doFilter(request, response);
        System.out.println(request.getServletContext().getContextPath() + " CustomFilter 过滤器执行完成后");
    }
}
