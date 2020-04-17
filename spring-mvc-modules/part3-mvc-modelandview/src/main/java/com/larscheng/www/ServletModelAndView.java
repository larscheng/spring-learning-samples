package com.larscheng.www;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: larscheng
 * @date: 2020/4/15 下午2:10
 * @description: 在不配置试图解析器的情况下，纯servlet实现视图跳转和解析
 */

@Controller
public class ServletModelAndView {
    /************************* 纯servlet不配置试图解析器 *****************************/

    /***
     *
     * 结果输出
     * @param request
     * @param response
     * @throws IOException
     */
    @RequestMapping(value = "/s1/t1")
    public void test1(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().write("111111111111111111111111");
    }

    /**
     * 重定向
     * @param request
     * @param response
     * @throws IOException
     */
    @RequestMapping(value = "/s1/t2")
    public void test2(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        request.getServletContext().setAttribute("aaa","我是Servlet请求转发过来的");
        response.sendRedirect("/index.jsp");
    }

    /**
     * 请求转发
     * @param request
     * @param response
     * @throws IOException
     */
    @RequestMapping(value = "/s1/t3")
    public void test3(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        request.getServletContext().setAttribute("aaa","我是Servlet重定向过来的");
        request.getRequestDispatcher("/WEB-INF/jsp/test.jsp").forward(request,response);
    }

}
