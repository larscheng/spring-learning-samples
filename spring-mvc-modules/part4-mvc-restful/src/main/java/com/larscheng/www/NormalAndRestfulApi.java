package com.larscheng.www;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: larscheng
 * @date: 2020/4/15 下午3:01
 * @description: 以前的api风格和restful风格对比
 */
@Controller
public class NormalAndRestfulApi {

    //http://localhost:8080/n1/t1?a=1&b=2
    @RequestMapping("/n1/t1")
    public String test1(int a, int b, Model modelAndView) {
        modelAndView.addAttribute("msg", "结果1为： " + (a + b));
        return "test";
    }

    //http://localhost:8080/n1/t2/1/2
    @GetMapping("/n1/t2/{a}/{b}")
    public String test2(@PathVariable int a, @PathVariable int b, Model modelAndView) {
        modelAndView.addAttribute("msg", "结果2为： " + (a + b));
        return "test";
    }
}
