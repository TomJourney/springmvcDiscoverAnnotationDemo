package com.tom.springmvc.exception;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName TomWebException.java
 * @Description TODO
 * @createTime 2024年10月03日 10:30:00
 */
public class TomWebException extends RuntimeException {

    public TomWebException() {
        super();
    }

    public TomWebException(String message) {
        super("TomWebException-" + message);
    }
}
