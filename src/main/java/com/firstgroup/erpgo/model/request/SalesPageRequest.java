package com.firstgroup.erpgo.model.request;

import lombok.Data;

/**
 * 销售订单分页 request
 */
@Data
public class SalesPageRequest {
    //pageNum 当前页面数
    //pageSize 页面大小
    private Integer pageNum;
    private Integer pageSize;
}
