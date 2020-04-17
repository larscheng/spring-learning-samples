package com.larscheng.www;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: larscheng
 * @date: 2020/4/15 上午10:48
 * @description:
 */
@Controller
public class HelloServlet {


    @RequestMapping(value = "hello1")
    public String hello1(Model model){
        model.addAttribute("msg","你请求的是hello1");
        return "hello";
    }

    @RequestMapping(value = "hello2")
    public String hello2(Model model){
        model.addAttribute("msg","你请求的是hello2");
        return "hello";
    }
    @RequestMapping(value = "hello3")
    public String hello3(Model model){
        model.addAttribute("msg","你请求的是hello3");
        return "hello";
    }

}
