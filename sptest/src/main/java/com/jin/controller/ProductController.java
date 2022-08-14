package com.jin.controller;

import com.jin.entity.dto.ProductDto;


import com.jin.entity.vo.ResultVo;
import com.jin.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 产品控制层
 */
//将当前Controller作为bean在spring中注册
    //将下方所有方法以json形式返回
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    /**
     * 根据条件查询产品个数
     */
    @GetMapping("/getProductNums")
    public ResultVo getProductNums(ProductDto productDto) {
        return productService.getProductNums(productDto);
    }

    /**
     * 根据条件获取产品详情
     */
    @GetMapping("/getProductDetails")
    public ResultVo getProductDetails(ProductDto productDto) {
        return productService.getProductDetails(productDto);
    }

    /**
     * 新增产品信息的方法
     */
    @PostMapping("/setProductInfo")
    public ResultVo setProductInfo(@RequestBody(required = false) ProductDto productDto) {
        return productService.setProductInfo(productDto);
    }

    /**
     * 更新产品信息的方法
     */
    @PutMapping("/updateProductInfo")
    public ResultVo updateProductInfo(@RequestBody(required = false) ProductDto productDto){
        return productService.updateProductInfo(productDto);
    }

    /**
     * 根据id删除产品信息
     */
    @DeleteMapping("/deleteProductInfo")
    public  ResultVo deleteProductInfo(Integer id){
        return productService.deleteProductInfo(id);
    }

    /**
     * 根据id批量删除产品信息
     */
    @DeleteMapping("/batchDeleteProductInfo")
    public  ResultVo batchDeleteProductInfo(@RequestParam(value = "idList",required = false) List<Integer> idList){
        return productService.batchDeleteProductInfo(idList);
    }
}