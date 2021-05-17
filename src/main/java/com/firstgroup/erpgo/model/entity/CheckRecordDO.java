package com.firstgroup.erpgo.model.entity;

import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 对账记录表
 * </p>
 *
 * @author lyw
 * @since 2021-05-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("check_record")
public class CheckRecordDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 对账记录的创建时间
     */
    private Date createTime;

    /**
     * 月订单数
     */
    private Integer orderQuantity;

    /**
     * 月销售金额
     */
    private BigDecimal salesAmount;

    /**
     * 月到账金额
     */
    private BigDecimal arrivalAmount;

    /**
     * 对账操作员
     */
    private String operator;


}
