package com.jin.service.impl;

import com.jin.dao.ScoreMapper;
import com.jin.entity.po.ScorePo;
import com.jin.entity.vo.ResultVo;
import com.jin.service.ScoreService;
import com.jin.utils.ResultUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.logging.Logger;

@Service
public class ScoreServiceImpl implements ScoreService {

    Logger logger = Logger.getLogger("ScoreServiceImpl");

    @Resource
    ScoreMapper scoreMapper;

    @Override
    public ResultVo updateUserScore(Integer id) {
        if (id==null||id==0) {
            logger.warning("传入的订单id不能为空");
            return ResultUtils.failed("传入的订单id不能为空");
        }
        // 1.获取当前订单中的所有产品
        // 2.计算出用户此次购买产品的总积分
        Integer scoreTotal = scoreMapper.selectTotalScore(id);

        // 如果此次订单的积分总数为0，则无需进行下面的操作
        if (scoreTotal==null||scoreTotal==0) {
            return ResultUtils.success("本订单没有积分奖励");
        }
        // 3.查询当前订单拥有者是否含有剩余积分
        List<ScorePo> list = scoreMapper.selectScoreByUserId(id);
        ScorePo scorePo = list.get(0);

        // 将此次得到的积分和该用户原有的积分叠加
        scorePo.setScoreNum(scorePo.getScoreNum() + scoreTotal);

        // 4.将更新后的积分返回到积分表（有可能是新增操作，有可能是更新操作）
        Integer integer = scoreMapper.updateUserScore(scorePo);
        if (integer > 0) {
            return ResultUtils.success("更新成功");
        }
        return ResultUtils.failed("更新失败");
    }
}
