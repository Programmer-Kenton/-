package com.sky.service;

import com.sky.dto.OrdersSubmitDTO;
import com.sky.vo.OrderSubmitVO;

/**
 * @Description TODO
 * @Version 1.0.0
 * @Date 2024/7/11 0:58
 * @Github https://github.com/Programmer-Kenton
 * @Author Kenton
 */

public interface OrderService {

    /**
     * 用户下单
     * @param ordersSubmitDTO
     * @return
     */
    OrderSubmitVO submitOrder(OrdersSubmitDTO ordersSubmitDTO);
}
