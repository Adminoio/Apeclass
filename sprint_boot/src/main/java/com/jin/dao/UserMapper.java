package com.jin.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jin.entity.dto.UserDto;
import com.jin.entity.po.ProductPo;
import com.jin.entity.po.UserPo;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

/**
 * 用户Mapper
 */
public interface UserMapper extends BaseMapper<UserPo> {
    /**
     * 根据条件获取用户数量
     */
    Integer getUserNums(UserDto userDto);

    /**
     * 根据条件获取用户详情
     */
    List<UserDto> getUserDetails(UserDto userDto);

    /**
     * 新增用户信息的方法
     */
    Integer setUserInfo(UserPo userPo);

    /**
     * 更新用户信息的方法
     */
    Integer updateUserInfo(UserPo userPo);

    /**
     * 删除用户信息的方法
     */
    Integer deleteUserInfo(Integer id);

    /**
     * 批量删除用户信息的方法
     */
    Integer batchDeleteUserInfo(List<Integer> idList);

    /**
     * 根据用户id查询有关的产品信息
     * 1、根据userId查询对应的订单id
     * 2、根据订单id查询与之有关的产品id
     * 3、根据产品id查询对应的产品信息
     */
    List<ProductPo> getProductInfoByUserId(Integer userId);
}
