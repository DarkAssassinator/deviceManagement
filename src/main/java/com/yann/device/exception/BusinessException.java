package com.yann.device.exception;

/**
 * @program: device
 * @description: 自定义业务异常
 * @author: Yann
 * @created: 2020/11/25 21:35
 */
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 8283097397234817756L;

    protected final String message;

    public BusinessException(String message) {
        this.message = message;
    }

    public BusinessException(String message, Throwable e) {
        super(message, e);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

