package com.yann.device.common.annotation;

import com.yann.device.common.enums.BusinessType;
import com.yann.device.common.enums.OperatorType;

import java.lang.annotation.*;

/**
 * @author Yann
 * @title: Log
 * @projectName device
 * @description: 自定义操作日志记录注解
 * @date 2020/11/816:02
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {
    /**
     * 模块
     */
    public String title() default "";

    /**
     * 功能
     */
    public BusinessType businessType() default BusinessType.OTHER;

    /**
     * 操作人类别
     */
    public OperatorType operatorType() default OperatorType.MANAGE;

    /**
     * 是否保存请求的参数
     */
    public boolean isSaveRequestData() default true;


}
