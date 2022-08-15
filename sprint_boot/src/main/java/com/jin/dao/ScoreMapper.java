package com.jin.dao;


import com.jin.entity.po.ScorePo;
import com.jin.entity.vo.ResultVo;

import java.util.List;

/**
 * 积分Mapper
 */
public interface ScoreMapper {

    /**
     * 用户完成订单后，更新用户的积分信息
     */
    Integer selectTotalScore(Integer id);

    /**
     * 根据订单ID查询用户剩余积分
     */
    List selectScoreByUserId(Integer id);

    Integer updateUserScore(ScorePo po);

}
