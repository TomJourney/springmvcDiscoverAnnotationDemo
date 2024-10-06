package com.tom.springmvc.exception;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName TomWebModel.java
 * @Description TODO
 * @createTime 2024年10月06日 19:10:00
 */
public class TomWebModel {

    private String code;

    private String message;

    public TomWebModel() {
        // do nothing
    }

    public TomWebModel(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public TomWebModel(TomWebException tomWebException) {
        this.code = tomWebException.getCode();
        this.message = tomWebException.getMessage();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
