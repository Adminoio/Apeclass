package com.jin.entity.dto;

import lombok.Data;

/**
 * 积分Dto
 */
@Data
public class ScoreDto {
    //积分表id
    private Integer id;

    //积分名称
    private String name;

    //用户id
    private Integer userId;

    //积分数量
    private Integer scoreNum;


}