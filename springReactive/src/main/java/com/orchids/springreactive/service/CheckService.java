package com.orchids.springreactive.service;

/**
 * @Auther: QWH
 * @Date: 2023-12-08-16:17
 */
public interface CheckService {
    /**
     * 结账
     * @param userId
     * @param bookIds
     */
    void checkout(Integer userId, Integer[] bookIds);
}
