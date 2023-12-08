package com.orchids.springreactive.service.impl;

import com.orchids.springreactive.dao.BookDao;
import com.orchids.springreactive.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Auther: QWH
 * @Date: 2023-12-08-16:09
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    @Override
    @Transactional()
    public void buyBook(Integer userId, Integer bookId) {
        //查询图书的价格
        Integer price = bookDao.getPriceByBookId(bookId);
        //更新图书的库存
        bookDao.updateStock(bookId);
        //更新用户的余额
        bookDao.updateBalance(userId,price);
    }
}
