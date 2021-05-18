package com.firstgroup.erpgo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.firstgroup.erpgo.mapper.SystemUserDOMapper;
import com.firstgroup.erpgo.model.entity.SystemUserDO;
import com.firstgroup.erpgo.service.SystemUserService;
import com.firstgroup.erpgo.utils.JWTUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SystemUserServiceImpl implements SystemUserService {

    @Autowired
    private SystemUserDOMapper systemUserDOMapper;


    @Override
    public String findByUsernameAndPwd(String username, String pwd) {
//        User user = userMapper.findByPhoneAndPwd(phone, CommonUtils.MD5(pwd));
        SystemUserDO systemUserDO = systemUserDOMapper.selectOne(new QueryWrapper<SystemUserDO>()
                .eq("username", username)
                .eq("pwd", pwd));

        if (systemUserDO == null) {
            return null;
        } else {
            return JWTUtils.geneJsonWebToken(systemUserDO);
        }

    }

}
