package com.jin.service;
import com.jin.entity.dto.OrderDto;
import com.jin.entity.vo.ResultVo;
import java.util.List;

/**
 * 订单服务层接口
 */
public interface OrderService {
    /**
     * 根据条件查询订单个数
     */
    ResultVo getOrderNums(OrderDto orderDto);

    /**
     * 根据条件获取订单详情
     */
    ResultVo getOrderDetails(OrderDto orderDto);

    /**
     * 新增订单信息的方法
     */
    ResultVo setOrderInfo(OrderDto orderDto);

    /**
     * 更新订单信息的方法
     */
    ResultVo updateOrderInfo(OrderDto orderDto);

    /**
     * 根据id删除订单信息
     */
    ResultVo deleteOrderInfo(Integer id);

    /**
     * 根据id批量删除订单信息
     */
    ResultVo batchDeleteOrderInfo(List<Integer> idList);
}
