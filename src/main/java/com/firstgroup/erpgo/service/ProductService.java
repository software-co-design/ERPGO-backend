package com.firstgroup.erpgo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.firstgroup.erpgo.model.DO.ProductsDO;
import com.firstgroup.erpgo.model.DO.SalesOrderDO;

public interface ProductService {

    IPage<ProductsDO> listProductByPage(Page<ProductsDO> objectPage);

    int addProduct(ProductsDO productsDO);
}
