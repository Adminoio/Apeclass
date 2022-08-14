package com.jin.controller;

import com.jin.entity.dto.OrderDto;
import com.jin.entity.vo.ResultVo;
import com.jin.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 订单控制层
 */
//将当前Controller作为bean在spring中注册
//将下方所有方法以json形式返回
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    /**
     * 根据条件查询订单个数
     */
    @GetMapping("/getOrderNums")
    public ResultVo getOrderNums(OrderDto orderDto) {
        return orderService.getOrderNums(orderDto);
    }

    /**
     * 根据条件获取订单详情
     */
    @GetMapping("/getOrderDetails")
    public ResultVo getOrderDetails(OrderDto orderDto) {
        return orderService.getOrderDetails(orderDto);
    }

    /**
     * 新增订单信息的方法
     */
    @PostMapping("/setOrderInfo")
    public ResultVo setOrderInfo(@RequestBody(required = false) OrderDto orderDto) {
        return orderService.setOrderInfo(orderDto);
    }

    /**
     * 更新订单信息的方法
     */
    @PutMapping("/updateOrderInfo")
    public ResultVo updateOrderInfo(@RequestBody(required = false) OrderDto orderDto){
        return orderService.updateOrderInfo(orderDto);
    }

    /**
     * 根据id删除订单信息
     */
    @DeleteMapping("/deleteOrderInfo")
    public  ResultVo deleteOrderInfo(Integer id){
        return orderService.deleteOrderInfo(id);
    }

    /**
     * 根据id批量删除订单信息
     */
    @DeleteMapping("/batchDeleteOrderInfo")
    public  ResultVo batchDeleteOrderInfo(@RequestParam(value = "idList",required = false) List<Integer> idList){
        return orderService.batchDeleteOrderInfo(idList);
    }
}
