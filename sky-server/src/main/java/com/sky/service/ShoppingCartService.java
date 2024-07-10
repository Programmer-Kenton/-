package com.sky.service;

import com.sky.dto.ShoppingCartDTO;
import com.sky.entity.ShoppingCart;

/**
 * @Description TODO
 * @Version 1.0.0
 * @Date 2024/7/10 23:38
 * @Github https://github.com/Programmer-Kenton
 * @Author Kenton
 */

public interface ShoppingCartService {

    /**
     * 添加购物车
     * @param shoppingCartDTO
     */
    void addShoppingCart(ShoppingCartDTO shoppingCartDTO);
}
