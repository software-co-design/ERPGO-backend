package com.firstgroup.erpgo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.firstgroup.erpgo.mapper.UserMapper;
import com.firstgroup.erpgo.model.entity.User;
import com.firstgroup.erpgo.service.UserService;
import com.firstgroup.erpgo.utils.JWTUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public String findByPhoneAndPwd(String phone, String pwd) {

//        User user = userMapper.findByPhoneAndPwd(phone, CommonUtils.MD5(pwd));
        User user = userMapper.selectOne(new QueryWrapper<User>()
                .eq("phone", phone)
                .eq("pwd", pwd));

        if (user == null) {
            return null;
        } else {
            return JWTUtils.geneJsonWebToken(user);
        }
    }
}
