package com.jin.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 订单Po
 */
@Data
@TableName("order_table")
public class OrderPo {

    //订单id
    @TableId(type = IdType.AUTO)
    private Integer id;

    //订单名称
    private String name;

    //订单种类
    private Integer type;

    //用户id
    private Integer userId;
}
