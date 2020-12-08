package com.schcode.controller;

import com.schcode.pojo.Book;
import com.schcode.service.BookService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;

@RequestMapping(value = "/book")
@Controller
public class BookController {
    @Autowired
    BookService bookService;

    @RequestMapping("/save")
    public String save(){
        bookService.saveBook(new Book(null,"三大框架整合测试"
        ,"国歌走了",new BigDecimal(1000),1,1
        ));
        return "redirect:/index.jsp";
    }


}
