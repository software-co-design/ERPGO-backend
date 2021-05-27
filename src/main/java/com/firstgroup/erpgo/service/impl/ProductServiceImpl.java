package com.firstgroup.erpgo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.firstgroup.erpgo.mapper.ProductDOMapper;
import com.firstgroup.erpgo.mapper.SystemUserDOMapper;
import com.firstgroup.erpgo.model.DO.ProductsDO;
import com.firstgroup.erpgo.model.DO.SalesOrderDO;
import com.firstgroup.erpgo.model.DO.SystemUserDO;
import com.firstgroup.erpgo.service.ProductService;
import com.firstgroup.erpgo.service.SystemUserService;
import com.firstgroup.erpgo.utils.JWTUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDOMapper productDOMapper;

    @Override
    public IPage<ProductsDO> listProductByPage(Page<ProductsDO> objectPage) {
        return productDOMapper.selectPage(objectPage, new QueryWrapper<ProductsDO>());
    }

    @Override
    public int addProduct(ProductsDO productsDO) {
        productsDO.setAvailableQuantity(productsDO.getTotalQuantity());
        productsDO.setLockedQuantity(0);
        return productDOMapper.insert(productsDO);
    }
}
