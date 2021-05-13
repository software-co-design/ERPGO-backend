package com.firstgroup.erpgo;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.firstgroup.erpgo.mapper.SystemUserDOMapper;

import com.firstgroup.erpgo.model.entity.SystemUserDO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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

}
