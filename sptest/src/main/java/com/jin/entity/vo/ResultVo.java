package com.jin.entity.vo;

import lombok.Data;

/**
 * 用来返回的Vo
 */
@Data
public class ResultVo {
    //结果状态码 1：成功    2：失败
    private Integer resultNum;

    //结果备注信息
    private String resultMessage;

    //结果集
    private Object resultObject;

}
