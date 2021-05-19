package com.firstgroup.erpgo.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.firstgroup.erpgo.model.entity.OrderProductsDO;
import com.firstgroup.erpgo.model.entity.SalesOrderDO;
import com.firstgroup.erpgo.model.request.SalesPageRequest;
import com.firstgroup.erpgo.service.SalesOrderService;
import com.firstgroup.erpgo.utils.JsonData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("api/v1/pri/sales_order")
public class SalesOrderController {

    @Autowired
    SalesOrderService salesOrderService;

    /**
     * 分页查询
     *
     * @param salesPageRequest
     * @return
     */
    @PostMapping("list")
    public JsonData salesOrderPage(@RequestBody SalesPageRequest salesPageRequest) {

        int pageNum = salesPageRequest.getPageNum();
        int pageSize = salesPageRequest.getPageSize();
        IPage<SalesOrderDO> page = salesOrderService.listSalesOrderByPage(new Page<>(pageNum, pageSize));

        if (page.getSize() == 0) {
            return JsonData.buildError("无更多信息");
        } else {
            return JsonData.buildSuccess(page);
        }
    }

    /**
     * 订单详细信息
     *
     * @param saleId
     * @return
     */
    @PostMapping("info")
    public JsonData getSalesOrderInfo(String saleId) {
        List<OrderProductsDO> list = salesOrderService.listSalesOrderInfo(saleId);
        if (list.size() != 0) {
            return JsonData.buildSuccess(list);
        } else {
            return JsonData.buildError("无更多信息");
        }
    }
}
