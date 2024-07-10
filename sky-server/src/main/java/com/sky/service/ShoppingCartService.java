package com.sky.service;

import com.sky.dto.ShoppingCartDTO;
import com.sky.entity.ShoppingCart;

import java.util.List;

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

    /**
     * 查看购物车
     * @return
     */
    List<ShoppingCart> showShppingCart();

    /**
     * 清空购物车
     */
    void cleanShoppingCart();


    /**
     * 删除购物车中一个商品
     * @param shoppingCartDTO
     */
    void subShoppingCart(ShoppingCartDTO shoppingCartDTO);

}
