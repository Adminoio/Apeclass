package com.jin.service;

import com.jin.entity.vo.ResultVo;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 积分服务层接口
 */
public interface ScoreService {

    /**
     * 用户完成订单后，更新用户的积分信息
     */
    ResultVo updateUserScore(Integer id);
}
