package com.firstgroup.erpgo.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
@TableName("user")//表名映射
public class User {
    private Integer id;

    private String username;

    @JsonIgnore
    private String pwd;

    private String realName;

//    @JsonProperty("head_img")
//    private String headImg;

    private int Rank;//职称

    private String phone;

    private String email;

//    @JsonProperty("create_time")
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
//    private Date createTime;

}
