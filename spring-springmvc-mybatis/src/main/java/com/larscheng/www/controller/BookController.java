package com.larscheng.www.controller;

import com.larscheng.www.pojo.Books;
import com.larscheng.www.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author: larscheng
 * @date: 2020/4/17 下午2:20
 * @description:
 */

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("booksService")
    private BooksService bookService;

    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list", list);
        return "allBook";
    }

}
