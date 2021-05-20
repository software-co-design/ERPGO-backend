package com.firstgroup.erpgo.model.DO;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 转账记录表
 * </p>
 *
 * @author lyw
 * @since 2021-05-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("transfer_record")
public class TransferRecordDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 转账时间
     */
    private Date createTime;

    /**
     * 客户id
     */
    private Integer clientId;

    /**
     * 客户姓名
     */
    private String clientName;

    /**
     * 转账金额
     */
    private Integer amount;

    /**
     * 备注
     */
    private String remarks;


}
