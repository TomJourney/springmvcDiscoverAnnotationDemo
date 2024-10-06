package com.tom.springmvc;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.ByteArrayMultipartFileEditor;
import org.springframework.web.multipart.support.StringMultipartFileEditor;
import org.springframework.web.servlet.*;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
import org.springframework.web.servlet.handler.UserRoleAuthorizationInterceptor;
import org.springframework.web.servlet.mvc.SimpleControllerHandlerAdapter;
import org.springframework.web.servlet.mvc.WebContentInterceptor;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName SpringmvcOtherComponent.java
 * @Description TODO
 * @createTime 2024年09月28日 21:17:00
 */
public class SpringmvcOtherComponent {

    public static void main(String[] args) {

        HandlerMapping handlerMapping;

        RequestMappingHandlerMapping requestMappingHandlerMapping;

        RequestMappingHandlerAdapter requestMappingHandlerAdapter;

        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter;

        MappingJackson2JsonView mappingJackson2JsonView;
    }
}
