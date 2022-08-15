package com.jin.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jin.entity.dto.ProductDto;
import com.jin.entity.po.ProductPo;
import com.jin.entity.vo.ResultVo;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

/**
 * 产品Mapper
 */

public interface ProductMapper extends BaseMapper<ProductPo> {
    /**
     * 根据条件查询产品个数
     */
    Integer getProductNums(ProductDto productDto);

    /**
     * 根据条件获取产品详情
     */
    List getProductDetails(ProductDto productDto);

    /**
     * 新增产品信息的方法
     */
    Integer setProductInfo(ProductDto productDto);

    /**
     * 更新产品信息的方法
     */
    Integer updateProductInfo(ProductDto productDto);

    /**
     * 根据id删除产品信息
     */
    Integer deleteProductInfo(Integer id);

    /**
     * 根据id批量删除产品信息
     */
    Integer batchDeleteProductInfo(List<Integer> idList);
}