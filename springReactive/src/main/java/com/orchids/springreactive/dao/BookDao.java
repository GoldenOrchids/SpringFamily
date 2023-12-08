package com.orchids.springreactive.dao;

/**
 * @Auther: QWH
 * @Date: 2023-12-08-15:28
 */
public interface BookDao {
    /**
     * 根据图书的id查询图书的价格
     * @param bookId
     * @return
     */
    Integer getPriceByBookId(Integer bookId);

    /**
     * 更新图书的库存
     * @param bookId
     */
    void updateStock(Integer bookId);

    /**
     * 更新用户的余额
     * @param userId
     * @param price
     */
    void updateBalance(Integer userId, Integer price);
}
