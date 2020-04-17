package com.larscheng.www;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: larscheng
 * @date: 2020/4/15 下午2:46
 * @description: mvc方式手动实现试图重定向和请求转发
 */
@Controller
public class MvcModelAndView {
    /************************* 纯servlet不配置试图解析器 *****************************/


    /***
     * 请求转发
     * @return
     */
    @RequestMapping("/m1/t1")
    public String test1(Model model) {
        model.addAttribute("aaa","我是通过MVC方式return转发过来的");
        return "/index.jsp";
    }


    /***
     * 请求转发2
     * @return
     */
    @RequestMapping("/m1/t2")
    public String test2(Model model) {
        model.addAttribute("aaa","我是通过MVC方式请求转发forward过来的");
        return "forward:/index.jsp";
    }


    /***
     * 重定向
     * @return
     */
    @RequestMapping("/m1/t3")
    public String test3(Model model) {
        model.addAttribute("aaa","我是通过MVC方式重定向过来的");
        return "redirect:/index.jsp";
    }


}

