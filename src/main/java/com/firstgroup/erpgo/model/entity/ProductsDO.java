package com.firstgroup.erpgo.model.entity;

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
@TableName("products")
public class ProductsDO implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 库存商品名称
     */
    private String name;

    /**
     * 库存商品规格
     */
    private String specification;

    /**
     * 库存商品总数量
     */
    private Integer totalQuantity;

    /**
     * 库存商品可用数量
     */
    private Integer availableQuantity;

    /**
     * 库存商品锁定数量
     */
    private Integer lockedQuantity;

    /**
     * 单位
     */
    private String unit;


}
