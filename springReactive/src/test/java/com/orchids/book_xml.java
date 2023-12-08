package com.orchids;

import com.orchids.springreactive.controller.BookController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ Author qwh
 * @ Date 2023/12/8 22:11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:book-xml.xml")
public class book_xml {
    @Autowired
    private BookController bookController;

    @Test
    public void testBuyBook(){
        bookController.buyBook(1, 1);
        bookController.checkout(1, new Integer[]{1,2});
    }
}
