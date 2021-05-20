package com.firstgroup.erpgo.model.DO;

import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 *
 * </p>
 *
 * @author lyw
 * @since 2021-05-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sales_order")
public class SalesOrderDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 销售人员
     */
    private String salesman;

    /**
     * 订单创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date createTime;

    /**
     * 客户姓名
     */
    private String clientName;

    /**
     * 客户地址
     */
    private String clientAddress;

    /**
     * 客户手机号码
     */
    private String clientPhone;

    /**
     * 订单金额
     */
    private BigDecimal totalMoney;

    /**
     * 操作员
     */
    private String operator;

    /**
     * 订单状态
     */
    private String status;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 逻辑删除标识位
     */
    private Integer deleted;


}
