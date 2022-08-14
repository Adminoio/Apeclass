package com.jin.entity.vo;

import lombok.Data;

/**
 * 订单Vo
 */
@Data
public class OrderVo {
    //订单id
    private Integer id;

    //订单名称
    private String name;

    //订单种类
    private Integer type;

    //用户id
    private Integer userId;
}
