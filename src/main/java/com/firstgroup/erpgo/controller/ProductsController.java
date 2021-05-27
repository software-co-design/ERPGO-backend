package com.firstgroup.erpgo.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.firstgroup.erpgo.model.DO.ProductsDO;
import com.firstgroup.erpgo.model.DO.SalesOrderDO;
import com.firstgroup.erpgo.model.request.LoginRequest;
import com.firstgroup.erpgo.model.request.PageRequest;
import com.firstgroup.erpgo.service.ProductService;
import com.firstgroup.erpgo.service.SystemUserService;
import com.firstgroup.erpgo.utils.JsonData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/pri/product")
public class ProductsController {

    @Autowired
    ProductService productService;


    /**
     * 分页返回产品列表
     *
     * @param pageRequest
     * @return
     */
    @PostMapping("list")
    public JsonData productPage(@RequestBody PageRequest pageRequest) {
        Integer pageNum = pageRequest.getPageNum();
        Integer pageSize = pageRequest.getPageSize();
        IPage<ProductsDO> page = productService.listProductByPage(new Page<>(pageNum, pageSize));

        if (page.getSize() == 0) {
            return JsonData.buildError("无更多信息");
        } else {
            return JsonData.buildSuccess(page);
        }
    }

    /**
     * 添加产品信息
     *
     * @param productsDO
     * @return
     */
    @PostMapping("add")
    public JsonData addProduct(@RequestBody ProductsDO productsDO) {
        int rows = productService.addProduct(productsDO);
        return rows != 0 ? JsonData.buildSuccess("success") : JsonData.buildError("添加失败");
    }

}
