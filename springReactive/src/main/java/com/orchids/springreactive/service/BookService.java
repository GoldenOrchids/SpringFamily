package com.orchids.springreactive.service;

/**
 * @Auther: QWH
 * @Date: 2023-12-08-16:08
 */
public interface BookService {
    /**
     * 买书
     * @param userId
     * @param bookId
     */
    void buyBook(Integer userId, Integer bookId);
}
