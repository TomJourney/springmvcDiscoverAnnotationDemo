package com.tom.springmvc;

import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.freemarker.FreeMarkerView;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName SpringmvcComponent.java
 * @Description TODO
 * @createTime 2024年09月22日 08:05:00
 */
public class SpringmvcComponent {
    public static void main(String[] args) {
        HandlerMapping mapping;

        BeanNameUrlHandlerMapping beanNameUrlHandlerMapping;
        SimpleUrlHandlerMapping simpleUrlHandlerMapping;

        Controller controller;

        AbstractController abstractController;


        UrlBasedViewResolver resolver;

        InternalResourceViewResolver internalResourceViewResolver;

        BeanNameViewResolver beanNameViewResolver;

        View view;

        FreeMarkerView freeMarkerView;
        FreeMarkerViewResolver freeMarkerViewResolver;

        RedirectView redirectView;

        ModelAndView modelAndView;

        UrlBasedViewResolver urlBasedViewResolver;

        DispatcherServlet dispatcherServlet;
    }
}
