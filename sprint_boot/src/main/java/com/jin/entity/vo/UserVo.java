package com.jin.entity.vo;

import lombok.Data;

/**
 * 用户Vo
 */
@Data
public class UserVo {
    //用户ID
    private Integer id;

    //用户名称
    private  String name;

    //提示信息
//    private String massage;

    //用户手机号
    private Integer phone;

    //用户年龄
    private Integer age;

    //用户邮箱地址
    private String email;
}