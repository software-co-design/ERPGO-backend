package com.firstgroup.erpgo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.firstgroup.erpgo.model.DO.OrderProductsDO;
import com.firstgroup.erpgo.model.DO.SalesOrderDO;

import java.util.List;

public interface SalesOrderService {
    IPage<SalesOrderDO> listSalesOrderByPage(Page<SalesOrderDO> page);

    List<OrderProductsDO> listSalesOrderInfo(Integer saleId);

    SalesOrderDO getSalesOrderById(Integer saleId);

    int updateSOStatusToSuccess(Integer salesOrderId);

    int updateSOStatusToFail(Integer salesOrderId);

    int logicDelSalesOrder(Integer salesOrderId);


}
