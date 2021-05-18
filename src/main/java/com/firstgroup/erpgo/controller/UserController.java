package com.firstgroup.erpgo.controller;

import com.firstgroup.erpgo.model.request.LoginRequest;

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
@RequestMapping("api/v1/pri/user")
public class UserController {

    @Autowired
    private SystemUserService systemUserService;

    /**
     * 登录接口
     *
     * @param loginRequest
     * @return
     */
    @PostMapping("login")
    public JsonData login(@RequestBody LoginRequest loginRequest) {
        String token = systemUserService.findByUsernameAndPwd(loginRequest.getUsername(), loginRequest.getPwd());
//        System.out.println("token=" + token);
        return token == null ? JsonData.buildError("登录失败，账号密码错误") : JsonData.buildSuccess(token);
    }

    /**
     * 退出登录接口
     *
     * @return
     */
    @PostMapping("logout")
    public JsonData logout() {
        return JsonData.buildSuccess("success");
    }
}
