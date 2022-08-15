package com.jin.service.impl;
import com.jin.dao.OrderMapper;
import com.jin.entity.dto.OrderDto;
import com.jin.entity.vo.ResultVo;
import com.jin.service.OrderService;
import com.jin.utils.ResultUtils;
import com.jin.utils.StringUtils;
import com.sun.istack.internal.logging.Logger;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * 订单服务层实现类
 */
@Service
public class OrderServiceImpl implements OrderService {

    Logger logger = Logger.getLogger(OrderServiceImpl.class);

    @Resource
    OrderMapper orderMapper;

    /**
     * 根据条件查询产品个数
     */
    @Override
    public ResultVo getOrderNums(OrderDto orderDto) {
        return ResultUtils.success("查询成功", "产品的总数量为" + orderMapper.getOrderNums(orderDto));
    }

    /**
     * 根据条件获取产品详情
     */
    @Override
    public ResultVo getOrderDetails(OrderDto orderDto) {

//        当orderDto没有传输有关pageNum和pageSize的参数时，应当分别给予一个默认的值
//        if (orderDto.getPageNum()==null||orderDto.getPageNum()==0) {
//            orderDto.setPageNum(5);
//        }
//        if (orderDto.getPageSize()==null||orderDto.getPageSize()==0) {
//            orderDto.setPageSize(0);
//        }
        return ResultUtils.success("查询成功", orderMapper.getOrderDetails(orderDto));
    }

    /**
     * 新增产品信息的方法
     */
    @Override
    public ResultVo setOrderInfo(OrderDto orderDto) {
        if (orderDto == null) {
            return ResultUtils.failed("当前对象不能为空");
        }

        if (StringUtils.isBlank(orderDto.getName())) {
            return ResultUtils.failed("产品名称不能为空或者空串");
        }

        Integer integer = orderMapper.setOrderInfo(orderDto);
        if (integer > 0) {
            return ResultUtils.success("添加成功");
        }
        return ResultUtils.failed("添加失败");
    }

    /**
     * 更新产品信息的方法
     */
    @Override
    public ResultVo updateOrderInfo(OrderDto orderDto) {
        if (orderDto == null || orderDto.getId() == null) {
            return ResultUtils.failed("当前对象或者当前对象ID为空");
        }

        Integer integer = orderMapper.updateOrderInfo(orderDto);
        if (integer > 0) {
            return ResultUtils.success("更新成功");
        }
        return ResultUtils.failed("更新失败");
    }

    /**
     * 根据id删除产品信息
     */
    @Override
    public ResultVo deleteOrderInfo(Integer id) {
        if (id == null) {
            //在项目中尽量使用日志来代替System.out.println
            logger.warning("传入的用户ID不能为空");
            //System.out.println("传入的用户ID不能为空");

            return ResultUtils.failed("传入的用户ID不能为空");
        }
        Integer integer = orderMapper.deleteOrderInfo(id);
        if (integer > 0) {
            return ResultUtils.success("删除成功");
        }
        return ResultUtils.failed("删除失败");
    }

    /**
     * 根据id批量删除产品信息
     */
    @Override
    public ResultVo batchDeleteOrderInfo(List<Integer> idList) {
        if (idList == null || idList.size() == 0) {
            return ResultUtils.success("请提供需要删除的id");
        }
        Integer integer = orderMapper.batchDeleteOrderInfo(idList);
        if (integer > 0) {
            return ResultUtils.success("批量删除操作成功", integer);
        }
        return ResultUtils.failed("批量操作删除失败");
    }

}
