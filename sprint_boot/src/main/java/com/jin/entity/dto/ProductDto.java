package com.jin.entity.dto;
import lombok.Data;
import java.math.BigDecimal;

/**
 * 产品Dto
 */
@Data
public class ProductDto {

    //产品id
    private Integer id;

    //产品名称
    private  String name;

    //产品日期
    private String date;

    //产品数量
    private Integer number;

    //产品价格
    private BigDecimal price;

    //每页数据量
    private Integer pageNum;

    //当前页数
    private Integer pageSize;
}
