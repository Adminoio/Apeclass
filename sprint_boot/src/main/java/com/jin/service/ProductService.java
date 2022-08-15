package com.jin.service;
import com.jin.entity.dto.ProductDto;
import com.jin.entity.vo.ResultVo;
import java.util.List;

/**
 * 产品服务层接口
 */
public interface ProductService {

    /**
     * 根据条件查询产品个数
     */
    ResultVo getProductNums(ProductDto productDto);

    /**
     * 根据条件获取产品详情
     */
    ResultVo getProductDetails(ProductDto productDto);

    /**
     * 新增产品信息的方法
     */
    ResultVo setProductInfo(ProductDto productDto);

    /**
     * 更新产品信息的方法
     */
    ResultVo updateProductInfo(ProductDto productDto);

    /**
     * 根据id删除产品信息
     */
    ResultVo deleteProductInfo(Integer id);


    /**
     * 根据id批量删除产品信息
     */
    ResultVo batchDeleteProductInfo(List<Integer> idList);

}