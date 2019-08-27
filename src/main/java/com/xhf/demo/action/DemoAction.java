package com.xhf.demo.action;

import com.xhf.mvc.annotation.GPAutowired;
import com.xhf.mvc.annotation.GPController;
import com.xhf.mvc.annotation.GPRequestMapping;
import com.xhf.mvc.annotation.GPRequestParam;
import com.xhf.demo.service.IDemoService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 谢红飞
 * @Title:
 * @Package
 * @Description:
 * @date 2019-8-18 20:41
 */
@GPController
@GPRequestMapping("/demo")
public class DemoAction {

    @GPAutowired
    IDemoService demoService;

    @GPRequestMapping("/query")
    public void query(HttpServletRequest req, HttpServletResponse resp,
                      @GPRequestParam("name") String name){
        //String result = demoService.get(name);
		String result = "My name is " + name;
        try {
            resp.getWriter().write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @GPRequestMapping("/add")
    public void add(HttpServletRequest req, HttpServletResponse resp,
                    @GPRequestParam("a") Integer a, @GPRequestParam("b") Integer b){
        try {
            resp.getWriter().write(a + "+" + b + "=" + (a + b));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @GPRequestMapping("/remove")
    public void remove(HttpServletRequest req,HttpServletResponse resp,
                       @GPRequestParam("id") Integer id){
    }

}
