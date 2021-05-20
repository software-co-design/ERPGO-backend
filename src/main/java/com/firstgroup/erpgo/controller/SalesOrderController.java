package com.firstgroup.erpgo.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.firstgroup.erpgo.model.DO.OrderProductsDO;
import com.firstgroup.erpgo.model.DO.SalesOrderDO;
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
     * 所有订单（分页查询）
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
     * 某个订单详细信息（产品）
     *
     * @param saleId
     * @return
     */
    @PostMapping("details")
    public JsonData getSalesOrderDetails(@RequestParam Integer saleId) {
        List<OrderProductsDO> list = salesOrderService.listSalesOrderInfo(saleId);
//        if (list.size() != 0) {
//            return JsonData.buildSuccess(list);
//        } else {
//            return JsonData.buildError("无更多信息");
//        }
        return JsonData.buildSuccess(list);
    }

    /**
     * 某个订单概括
     *
     * @param saleId
     * @return
     */
    @PostMapping("simple")
    public JsonData getSalesOrderSimple(@RequestBody Integer saleId) {
        SalesOrderDO salesOrderDO = salesOrderService.getSalesOrderById(saleId);
        if (salesOrderDO != null) {
            return JsonData.buildSuccess(salesOrderDO);
        } else {
            return JsonData.buildError("无此订单信息");
        }
    }

    /**
     * 将订单状态修改为 审核通过
     *
     * @param salesOrderId
     * @return
     */
    @PostMapping("check_success")
    public JsonData updateSOStatusToSuccess(@RequestParam Integer salesOrderId) {
        if (salesOrderId != null) {
            int cols = salesOrderService.updateSOStatusToSuccess(salesOrderId);
            return cols != 0 ? JsonData.buildSuccess("success") : JsonData.buildError("fail");
        } else {
            return JsonData.buildError("没有传入订单编号saleOrderId");
        }
    }

    /**
     * 将订单状态修改为 审核不通过
     *
     * @param salesOrderId
     * @return
     */
    @PostMapping("check_fail")
    public JsonData updateSOStatusToFail(@RequestParam Integer salesOrderId) {
        if (salesOrderId != null) {
            int cols = salesOrderService.updateSOStatusToFail(salesOrderId);
            return cols != 0 ? JsonData.buildSuccess("success") : JsonData.buildError("fail");
        } else {
            return JsonData.buildError("没有传入订单编号saleOrderId");
        }
    }

    /**
     * 逻辑删除订单信息
     *
     * @param salesOrderId
     * @return
     */
    @PostMapping("del")
    public JsonData delSalesOder(@RequestParam Integer salesOrderId) {
        if (salesOrderId != null) {
            int cols = salesOrderService.logicDelSalesOrder(salesOrderId);
            return cols != 0 ? JsonData.buildSuccess("success") : JsonData.buildError("fail");
        } else {
            return JsonData.buildError("没有传入订单编号saleOrderId");
        }
    }


}
