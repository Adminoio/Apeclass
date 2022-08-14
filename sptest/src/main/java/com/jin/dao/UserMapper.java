package com.jin.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jin.entity.dto.UserDto;
import com.jin.entity.po.UserPo;


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
    List getUserDetails(UserDto userDto);

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
}
