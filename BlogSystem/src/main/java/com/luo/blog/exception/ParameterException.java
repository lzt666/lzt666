package com.luo.blog.exception;


public class ParameterException extends RuntimeException{
    private String code;

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public ParameterException(String message) {
        super("客户端错误："+message);
        code="400";
    }

    public ParameterException(String message, Throwable cause) {
        super("客户端错误"+message,cause);
        code="400";
    }
}
