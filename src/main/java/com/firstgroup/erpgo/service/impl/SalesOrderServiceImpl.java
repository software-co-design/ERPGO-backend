package com.firstgroup.erpgo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.firstgroup.erpgo.mapper.OrderProductsDoMapper;
import com.firstgroup.erpgo.mapper.SalesOrderDoMapper;
import com.firstgroup.erpgo.model.DO.OrderProductsDO;
import com.firstgroup.erpgo.model.DO.SalesOrderDO;
import com.firstgroup.erpgo.service.SalesOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesOrderServiceImpl implements SalesOrderService {
    @Autowired
    private SalesOrderDoMapper salesOrderDoMapper;

    @Autowired
    private OrderProductsDoMapper orderProductsDoMapper;

    @Override
    public IPage<SalesOrderDO> listSalesOrderByPage(Page<SalesOrderDO> page) {
        return salesOrderDoMapper.selectPage(page, new QueryWrapper<SalesOrderDO>());
    }

    @Override
    public List<OrderProductsDO> listSalesOrderInfo(Integer saleId) {
        return orderProductsDoMapper.selectList(new QueryWrapper<OrderProductsDO>().eq("sales_order_id", saleId));
    }

    @Override
    public SalesOrderDO getSalesOrderById(Integer saleId) {
        return salesOrderDoMapper.selectOne(new QueryWrapper<SalesOrderDO>().eq("id", saleId));
    }

    @Override
    public int updateSOStatusToSuccess(Integer salesOrderId) {
        SalesOrderDO salesOrderDO = new SalesOrderDO();
        salesOrderDO.setStatus("审核通过");
        return salesOrderDoMapper.update(salesOrderDO, new QueryWrapper<SalesOrderDO>().eq("id", salesOrderId));
    }

    @Override
    public int updateSOStatusToFail(Integer salesOrderId) {
        SalesOrderDO salesOrderDO = new SalesOrderDO();
        salesOrderDO.setStatus("审核未通过");
        return salesOrderDoMapper.update(salesOrderDO, new QueryWrapper<SalesOrderDO>().eq("id", salesOrderId));
    }

    @Override
    public int logicDelSalesOrder(Integer salesOrderId) {
        return salesOrderDoMapper.deleteById(salesOrderId);
    }


}
