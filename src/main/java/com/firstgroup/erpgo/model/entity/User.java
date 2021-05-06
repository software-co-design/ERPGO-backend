package com.firstgroup.erpgo.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@TableName("system_user")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;

    private String username;

    @JsonIgnore
    private String pwd;

    private String realName;

    @TableField("`rank`")
    private String rank;//职称

    private String phone;

    private String email;
}
