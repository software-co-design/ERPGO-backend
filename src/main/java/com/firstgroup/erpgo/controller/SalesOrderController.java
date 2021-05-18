package com.firstgroup.erpgo.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.firstgroup.erpgo.model.entity.SalesOrderDO;
import com.firstgroup.erpgo.model.request.SalesPageRequest;
import com.firstgroup.erpgo.service.SalesOrderService;
import com.firstgroup.erpgo.utils.JsonData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.regex.Pattern;

@Slf4j
@RestController
@RequestMapping("api/v1/pri/salesOrder")
public class SalesOrderController {
    @Autowired
    SalesOrderService salesOrderService;
    /**
     * 分页查询
     *
     * @param salesPageRequest
     * @return
     */
    @PostMapping("Page")
    public JsonData salesOrderPage(@RequestBody SalesPageRequest salesPageRequest){

        int pageNum= salesPageRequest.getPageNum();
        int pageSize= salesPageRequest.getPageSize();
        IPage<SalesOrderDO> page = salesOrderService.selectSalesOrderPage(new Page<>(pageNum, pageSize));

        if (page.getSize() == 0){
            return JsonData.buildError("无更多信息");
        }else{
            return JsonData.buildSuccess(page);
        }
    }
}
