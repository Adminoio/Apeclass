package com.jin.entity.dto;

import lombok.Data;

/**
 * 订单Dto
 */
@Data
public class OrderDto {
    //订单id
    private Integer id;

    //订单名称
    private String name;

    //订单种类
    private Integer type;

    //用户id
    private Integer userId;

    //每页数据量
    private Integer pageNum;

    //当前页数
    private Integer pageSize;
}

