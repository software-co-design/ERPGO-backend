package com.firstgroup.erpgo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.firstgroup.erpgo.model.DO.SalesOrderDO;
import com.firstgroup.erpgo.service.SalesOrderService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class SalesOrderControllerTest {
    @Autowired
    private SalesOrderService salesOrderService;

    @Test
    void delSalesOderTest() {
        int rows = salesOrderService.logicDelSalesOrder(4);
        log.info("rows: {}", rows);
    }

    /**
     * 测试 修改订单状态为 审核通过
     */
    @Test
    void testUpdateSOStatusToSuccess() {
        int rows = salesOrderService.updateSOStatusToSuccess(1);
        log.info("rows: {}", rows);
    }

    /**
     * 测试 修改订单状态为 审核未通过
     */
    @Test
    void updateSalesOrderToFailTest() {
        int rows = salesOrderService.updateSOStatusToFail(1);
        log.info("rows: {}", rows);
    }
}
