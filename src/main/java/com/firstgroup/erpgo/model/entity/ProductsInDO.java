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
@TableName("products_in")
public class ProductsInDO implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "stock_in_id", type = IdType.AUTO)
    private Integer stockInId;

    private Integer productId;

    /**
     * 入库时间
     */
    private Date createTime;

    /**
     * 入库产品名称
     */
    private String productName;

    /**
     * 入库产品数量
     */
    private Integer quantity;

    /**
     * 操作员
     */
    private String operator;


}
