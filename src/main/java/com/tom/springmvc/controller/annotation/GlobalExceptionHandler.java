package com.tom.springmvc.controller.annotation;

import com.tom.springmvc.exception.TomWebException;
import com.tom.springmvc.exception.TomWebModel;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName HelloWorldAnnotationControllerRequestResponseBody.java
 * @Description TODO
 * @createTime 2024年10月04日 11:55:00
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Log LOGGER = LogFactory.getLog(GlobalExceptionHandler.class);

    public GlobalExceptionHandler() {
        // do nothing.
    }

    @ExceptionHandler({TomWebException.class, Exception.class})
    public ResponseEntity<TomWebModel> handleException(Exception ex, WebRequest request) {
        // 打印异常栈
        LOGGER.error("GlobalExceptionHandler#handleException() method handle exception. ", ex);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        if (ex instanceof TomWebException tomWebException) {
            return new ResponseEntity<>(new TomWebModel(tomWebException), headers, HttpStatus.OK);
        }
        return new ResponseEntity<>(new TomWebModel("000000", ex.getMessage()), headers, HttpStatus.OK);
    }
}
