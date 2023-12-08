package com.orchids.springreactive.controller;

import com.orchids.springreactive.service.BookService;
import com.orchids.springreactive.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Auther: QWH
 * @Date: 2023-12-08-16:13
 */
@Controller
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private CheckService checkService;
    public void buyBook(Integer userId,Integer bookId){
        bookService.buyBook(userId,bookId);
    }
    public void checkout(Integer userId,Integer[] bookIds){
            checkService.checkout(userId,bookIds);
    }
}
