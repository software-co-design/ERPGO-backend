package com.firstgroup.grouperp.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.firstgroup.grouperp.mapper.UserMapper;
import com.firstgroup.grouperp.model.entity.User;
import com.firstgroup.grouperp.service.UserService;
import com.firstgroup.grouperp.utils.CommonUtils;
import com.firstgroup.grouperp.utils.JWTUtils;
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
