package com.jin.entity.vo;

import lombok.Data;

/**
 * 积分Vo
 */
@Data
public class ScoreVo {

    //积分表id
    private Integer id;

    //积分名称
    private String name;

    //用户id
    private Integer userId;

    //积分数量
    private Integer scoreNum;
}