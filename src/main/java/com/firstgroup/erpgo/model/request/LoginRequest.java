package com.firstgroup.erpgo.model.request;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 登录 request
 */
@Data
public class LoginRequest {

    private String username;

    @JsonProperty("password")
    private String pwd;

}
