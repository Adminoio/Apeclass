package com.jin.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jin.entity.dto.OrderDto;
import com.jin.entity.po.OrderPo;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

/**
 * 订单Mapper
 */

public interface OrderMapper extends BaseMapper<OrderPo> {
    /**
     * 根据条件查询产品个数
     */
    Integer getOrderNums(OrderDto orderDto);

    /**
     * 根据条件获取产品详情
     */
    List getOrderDetails(OrderDto orderDto);

    /**
     * 新增产品信息的方法
     */
    Integer setOrderInfo(OrderDto orderDto);

    /**
     * 更新产品信息的方法
     */
    Integer updateOrderInfo(OrderDto orderDto);

    /**
     * 根据id删除产品信息
     */
    Integer deleteOrderInfo(Integer id);

    /**
     * 根据id批量删除产品信息
     */
    Integer batchDeleteOrderInfo(List<Integer> idList);
}
