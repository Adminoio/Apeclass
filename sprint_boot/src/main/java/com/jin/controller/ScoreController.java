package com.jin.controller;


import com.jin.entity.dto.OrderDto;
import com.jin.entity.vo.ResultVo;
import com.jin.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 积分控制器
 */
@RestController
@RequestMapping("/score")
public class ScoreController {

    @Autowired
    ScoreService scoreService;


    //    用户完成订单后，根据订单id更新用户的积分信息
    @PostMapping("/updateUserScore")
    public ResultVo updateUserScore(@RequestBody OrderDto orderDto){
        return scoreService.updateUserScore(orderDto.getId());
    }
}
