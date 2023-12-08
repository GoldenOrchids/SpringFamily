package com.orchids;

import com.orchids.springreactive.controller.BookController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: QWH
 * @Date: 2023-12-08-17:12
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:book-annotation.xml")
public class book_annotation {
    @Autowired
    private BookController bookController;

    @Test
    public void testBuyBook(){
        bookController.buyBook(1, 1);
//        bookController.checkout(1, new Integer[]{1,2});
    }
}
