package com.firstgroup.erpgo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.firstgroup.erpgo.model.entity.SalesOrderDO;

import java.util.List;

public interface SalesOrderService {
    IPage<SalesOrderDO> selectSalesOrderPage(Page<SalesOrderDO> page);
}
