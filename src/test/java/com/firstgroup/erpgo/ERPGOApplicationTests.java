package com.firstgroup.erpgo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.firstgroup.erpgo.mapper.UserMapper;
import com.firstgroup.erpgo.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ERPGOApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        User user = userMapper.selectOne(new QueryWrapper<User>().eq("id", 1));
//		log.info("bannerDO: {}", bannerDO);
    }

}
