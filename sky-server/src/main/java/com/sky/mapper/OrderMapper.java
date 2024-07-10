package com.sky.mapper;

import com.sky.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description TODO
 * @Version 1.0.0
 * @Date 2024/7/11 1:02
 * @Github https://github.com/Programmer-Kenton
 * @Author Kenton
 */

@Mapper
public interface OrderMapper {


    /**
     * 插入订单数据
     * @param orders
     */
    void insert(Orders orders);
}
