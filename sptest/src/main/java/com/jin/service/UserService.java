package com.jin.service;

import com.jin.entity.dto.UserDto;
import com.jin.entity.vo.ResultVo;
import java.util.List;

/**
 * 用户服务层接口
 */
public interface UserService {
    /**
     * 根据条件获取用户数量
     *
     */
    ResultVo getUserNums(UserDto userDto);

    /**
     * 根据条件获取用户详情
     */
    ResultVo getUserDetails(UserDto userDto);

    /**
     * 新增用户信息的方法
     */
    ResultVo setUserInfo(UserDto userDto);

    /**
     * 更新用户信息的方法
     */
    ResultVo updateUserInfo(UserDto userDto);

    /**
     * 删除用户信息的方法
     */
    ResultVo deleteUserInfo(Integer id);

    /**
     * 批量删除用户信息的方法
     */
    ResultVo batchDeleteUserInfo(List<Integer> idList);

    /**
     * 通过MuBatis-plus来批量获取用户信息
     */
    ResultVo batchGetUserInfo();
}
