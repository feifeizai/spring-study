package com.xhf.mvc.annotation;

import java.lang.annotation.*;
/**
 * @author 谢红飞
 * @Title:
 * @Package
 * @Description:
 * @date 2019-8-18 20:39
 */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface GPRequestParam {
    String value() default "";
}
