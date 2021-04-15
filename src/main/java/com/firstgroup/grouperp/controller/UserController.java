package com.firstgroup.grouperp.controller;

import com.firstgroup.grouperp.model.request.LoginRequest;
import com.firstgroup.grouperp.service.UserService;
import com.firstgroup.grouperp.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/pri/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 登录接口
     *
     * @param loginRequest
     * @return
     */
    @PostMapping("login")
    public JsonData login(@RequestBody LoginRequest loginRequest) {

        String token = userService.findByPhoneAndPwd(loginRequest.getPhone(), loginRequest.getPwd());

        return token == null ? JsonData.buildError("登录失败，账号密码错误") : JsonData.buildSuccess(token);

    }
}
