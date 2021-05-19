package com.firstgroup.erpgo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.firstgroup.erpgo.model.entity.OrderProductsDO;
import com.firstgroup.erpgo.model.entity.ProductsOutDO;
import com.firstgroup.erpgo.model.entity.SalesOrderDO;

import java.util.List;

public interface SalesOrderService {
    IPage<SalesOrderDO> listSalesOrderByPage(Page<SalesOrderDO> page);
    List<OrderProductsDO> listSalesOrderInfo(Integer saleId);
    SalesOrderDO getSalesOrderById(Integer saleId);
}
