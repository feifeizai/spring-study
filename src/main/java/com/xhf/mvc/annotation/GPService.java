package com.xhf.mvc.annotation;

import java.lang.annotation.*;
/**
 * @author 谢红飞
 * @Title:
 * @Package
 * @Description:
 * @date 2019-8-18 20:40
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface GPService {
    String value() default "";
}
