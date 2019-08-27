package com.xhf.demo.service.impl;

import com.xhf.demo.service.IDemoService;
import com.xhf.mvc.annotation.GPService;


/**
 * @author 谢红飞
 * @Title:
 * @Package
 * @Description:
 * @date 2019-8-18 20:43
 */
@GPService
public class DemoService implements IDemoService {

    public String get(String name) {
        return "My name is " + name;
    }
}
