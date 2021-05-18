package com.firstgroup.erpgo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.firstgroup.erpgo.mapper.SalesOrderDoMapper;
import com.firstgroup.erpgo.model.entity.SalesOrderDO;
import com.firstgroup.erpgo.model.entity.SystemUserDO;
import com.firstgroup.erpgo.service.SalesOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SalesOrderServiceImpl implements SalesOrderService {
    @Autowired
    private SalesOrderDoMapper salesOrderDoMapper;

    @Override
    public IPage<SalesOrderDO> listSalesOrderByPage(Page<SalesOrderDO> page) {
        return salesOrderDoMapper.selectPage(page, new QueryWrapper<SalesOrderDO>());
    }
}
