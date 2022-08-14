package com.jin.service.impl;
import com.jin.dao.ProductMapper;
import com.jin.entity.dto.ProductDto;
import com.jin.entity.vo.ResultVo;
import com.jin.service.ProductService;
import com.jin.utils.ResultUtils;
import com.jin.utils.StringUtils;
import com.sun.istack.internal.logging.Logger;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * 产品服务层实现类
 */
@Service
public class ProductServiceImpl implements ProductService {

    Logger logger = Logger.getLogger(ProductServiceImpl.class);

    @Resource
    ProductMapper productMapper;

    /**
     * 根据条件查询产品个数
     */
    @Override
    public ResultVo getProductNums(ProductDto productDto) {
        return ResultUtils.success("查询成功", "产品的总数量为" + productMapper.getProductNums(productDto));
    }

    /**
     * 根据条件获取产品详情
     */
    @Override
    public ResultVo getProductDetails(ProductDto productDto) {
        return ResultUtils.success("查询成功", productMapper.getProductDetails(productDto));
    }

    /**
     * 新增产品信息的方法
     */
    @Override
    public ResultVo setProductInfo(ProductDto productDto) {
        if (productDto == null) {
            return ResultUtils.failed("当前对象不能为空");
        }

        if (StringUtils.isBlank(productDto.getName())) {
            return ResultUtils.failed("产品名称不能为空或者空串");
        }

        Integer integer = productMapper.setProductInfo(productDto);
        if (integer > 0) {
            return ResultUtils.success("添加成功");
        }
        return ResultUtils.failed("添加失败");
    }

    /**
     * 更新产品信息的方法
     */
    @Override
    public ResultVo updateProductInfo(ProductDto productDto) {
        if (productDto == null || productDto.getId() == null) {
            return ResultUtils.failed("当前对象或者当前对象ID为空");
        }

        Integer integer = productMapper.updateProductInfo(productDto);
        if (integer > 0) {
            return ResultUtils.success("更新成功");
        }
        return ResultUtils.failed("更新失败");
    }

    /**
     * 根据id删除产品信息
     */
    @Override
    public ResultVo deleteProductInfo(Integer id) {
        if (id == null) {
            //在项目中尽量使用日志来代替System.out.println
            logger.warning("传入的用户ID不能为空");
            //System.out.println("传入的用户ID不能为空");

            return ResultUtils.failed("传入的用户ID不能为空");
        }
        Integer integer = productMapper.deleteProductInfo(id);
        if (integer > 0) {
            return ResultUtils.success("删除成功");
        }
        return ResultUtils.failed("删除失败");
    }

    /**
     * 根据id批量删除产品信息
     */
    @Override
    public ResultVo batchDeleteProductInfo(List<Integer> idList) {
        if (idList == null || idList.size() == 0) {
            return ResultUtils.success("请提供需要删除的id");
        }
        Integer integer = productMapper.batchDeleteProductInfo(idList);
        if (integer > 0) {
            return ResultUtils.success("批量删除操作成功", integer);
        }
        return ResultUtils.failed("批量操作删除失败");
    }

}