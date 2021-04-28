package com.firstgroup.erpgo.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("client")
public class Client {
    private int id;

    private String companyName;

    private String companyAddress;

    private String contacts; //联系人

    private String email;

    private String phone;

    private Double balance;
}
