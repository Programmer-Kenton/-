package com.sky.mapper;

import com.sky.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

/**
 * @Description TODO
 * @Version 1.0.0
 * @Date 2024/7/11 1:03
 * @Github https://github.com/Programmer-Kenton
 * @Author Kenton
 */

@Mapper
public interface OrderDetailMapper {

    /**
     * 批量插入订单明细数据
     * @param orderDetailList
     */
    void insertBatch(ArrayList<OrderDetail> orderDetailList);
}
