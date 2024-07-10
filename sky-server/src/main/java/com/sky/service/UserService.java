package com.sky.service;

import com.sky.dto.UserLoginDTO;
import com.sky.entity.User;

/**
 * @Description 用户服务接口
 * @Version 1.0.0
 * @Date 2024/7/10 16:18
 * @Github https://github.com/Programmer-Kenton
 * @Author Kenton
 */
public interface UserService {

    /**
     * 微信登录
     * @param userLoginDTO
     * @return
     */
    User wxLogin(UserLoginDTO userLoginDTO);
}
