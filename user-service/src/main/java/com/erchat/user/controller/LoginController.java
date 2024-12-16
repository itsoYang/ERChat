package com.erchat.user.controller;

import com.erchat.common.domain.APIResponse;
import com.erchat.user.model.User;
import com.erchat.user.service.ILoginService;
import com.erchat.user.utils.JwtTool;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;

@Slf4j
@RestController()
@RequestMapping("/login")
@RequiredArgsConstructor
public class LoginController {

    private final ILoginService loginService;

    private final JwtTool jwtTool;

    @PostMapping("/password")
    public APIResponse<String> loginOfPassword(String username, String password){
        log.info("phone:{},password:{}", username, password);
        User user = loginService.loginOfPassword(username, password);
        if (user == null){
            return APIResponse.error("用户名或密码错误");
        }
        String token = jwtTool.createToken(user.getId(), Duration.ofDays(1));
        return APIResponse.success("登录成功", token);
    }

    @PostMapping("/verification")
    public APIResponse<String> loginOfVerifyCode(String phone, String verifyCode){
        loginService.loginOfVerifyCode(phone, verifyCode);
        return APIResponse.success("");
    }
}
