package com.luo.blog.exception;

public class BusinessException extends RuntimeException {
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BusinessException(String message) {
        super("业务异常"+message);
        this.code="401";
    }

    public BusinessException(String message, Throwable cause) {
        super("业务异常"+message,cause);
        this.code="401";
    }
}
