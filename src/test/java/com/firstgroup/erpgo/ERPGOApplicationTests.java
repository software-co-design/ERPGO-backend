package com.firstgroup.erpgo;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.firstgroup.erpgo.mapper.SystemUserDOMapper;

import com.firstgroup.erpgo.model.entity.OrderProductsDO;
import com.firstgroup.erpgo.model.entity.SalesOrderDO;
import com.firstgroup.erpgo.model.entity.SystemUserDO;
import com.firstgroup.erpgo.service.SalesOrderService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
class ERPGOApplicationTests {

    @Autowired
    private SystemUserDOMapper systemUserDOMapper;

    @Test
    void contextLoads() {
        SystemUserDO systemUserDO = systemUserDOMapper.selectOne(new QueryWrapper<SystemUserDO>().eq("id",1));
        log.info("user: {}", systemUserDO);
    }

    @Autowired
    private SalesOrderService salesOrderService;

    @Test
    void salesOrderPageTest(){
        Page<SalesOrderDO> mypage=new Page<>(2,2);
        IPage<SalesOrderDO> iPage=salesOrderService.listSalesOrderByPage(mypage);
        System.out.println(iPage);
    }

    @Test
    void salesOrderInfoPage(){
        List<OrderProductsDO> list=salesOrderService.listSalesOrderInfo(2);
        System.out.println(list);
        System.out.println(salesOrderService.getSalesOrderById(2));
    }
}
