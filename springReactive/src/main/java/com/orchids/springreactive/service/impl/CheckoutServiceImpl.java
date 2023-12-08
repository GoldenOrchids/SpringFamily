package com.orchids.springreactive.service.impl;


import com.orchids.springreactive.service.BookService;
import com.orchids.springreactive.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: QWH
 * @Date: 2023-12-08-16:18
 */
@Service
public class CheckoutServiceImpl implements CheckService {
    @Autowired
    private BookService bookService;
    @Override
    public void checkout(Integer userId, Integer[] bookIds) {
        for (Integer id : bookIds) {
            bookService.buyBook(userId,id);
        }
    }
}
