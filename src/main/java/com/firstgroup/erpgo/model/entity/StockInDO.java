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
 * 入库单
 * </p>
 *
 * @author lyw
 * @since 2021-05-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("stock_in")
public class  StockInDO implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 入库单位
     */
    private String unit;

    /**
     * 入库时间
     */
    private Date createTime;

    /**
     * 操作员
     */
    private String operator;

    /**
     * 入库状态
     */
    private String status;

    /**
     * 入库地址
     */
    private String address;

    /**
     * 备注
     */
    private String remarks;


}
