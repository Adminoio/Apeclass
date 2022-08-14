package com.jin.entity.dto;
import lombok.Data;

/**
 * 用户Dto
 */
@Data
public class UserDto {
    //用户id
    private Integer id;

    //用户名称
    private  String name;

    //用户年龄
    private Integer age;

    //用户手机号
    private Integer phone;

    //用户邮箱地址
    private String email;

    //每页数据量
    private Integer pageNum;

    //当前页数
    private Integer pageSize;

}