package com.firstgroup.erpgo.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

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
@TableName("products_out")
public class ProductsOutDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 发货单id
     */
    @TableId(value = "sales_order_id", type = IdType.AUTO)
    private Integer salesOrderId;

    /**
     * 产品id
     */
    private Integer productId;

    /**
     * 出货时间
     */
    private Date outTime;

    /**
     * 出货产品名称
     */
    private String productName;

    /**
     * 出货产品数量
     */
    private Integer quantity;

    /**
     * 操作员
     */
    private String operator;


}
