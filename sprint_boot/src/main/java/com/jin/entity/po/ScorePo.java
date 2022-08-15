package com.jin.entity.po;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
/**
 * 积分Po
 */
@Data
@TableName("score_table")
public class ScorePo {

    //积分表id
    @TableId(type = IdType.AUTO)
    private Integer id;

    //积分名称
    private String name;

    //用户id
    private Integer userId;

    //积分数量
    private Integer scoreNum;
}