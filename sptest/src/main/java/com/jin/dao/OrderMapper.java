package com.jin.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jin.entity.dto.OrderDto;
import com.jin.entity.dto.ProductDto;
import com.jin.entity.po.OrderPo;
import lombok.Data;

import java.util.List;

/**
 * 订单Mapper
 */
public interface OrderMapper extends BaseMapper<OrderPo> {
    /**
     * 根据条件查询产品个数
     */
    Integer getProductNums(OrderDto orderDto);

    /**
     * 根据条件获取产品详情
     */
    List getProductDetails(OrderDto orderDto);

    /**
     * 新增产品信息的方法
     */
    Integer setProductInfo(OrderDto orderDto);

    /**
     * 更新产品信息的方法
     */
    Integer updateProductInfo(OrderDto orderDto);

    /**
     * 根据id删除产品信息
     */
    Integer deleteProductInfo(Integer id);

    /**
     * 根据id批量删除产品信息
     */
    Integer batchDeleteProductInfo(List<Integer> idList);
}
