package com.firstgroup.erpgo.model.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("order_products")
public class OrderProductsDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 销售订单编号
     */
      @TableId(value = "sales_order_id", type = IdType.AUTO)
    private Integer salesOrderId;

    /**
     * 产品编号
     */
    private Integer productId;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 产品规格
     */
    private String productSpecification;

    /**
     * 产品单价
     */
    private String unitPrice;

    /**
     * 产品数量
     */
    private Integer productQuantity;

    /**
     * 总金额
     */
    private BigDecimal 
totalMoney;


}
