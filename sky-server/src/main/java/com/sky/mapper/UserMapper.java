package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Description 微信小程序用户数据库接口
 * @Version 1.0.0
 * @Date 2024/7/10 16:32
 * @Github https://github.com/Programmer-Kenton
 * @Author Kenton
 */

@Mapper
public interface UserMapper {

    @Select("select * from user where openid = #{openid}")
    User getByOpenid(String openid);

    /**
     * 插入用户数据
     * @param user
     */
    void insert(User user);

    @Select("select * from user where id = #{id}")
    User getById(Long userId);
}
