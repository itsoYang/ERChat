package com.erchat.user.controller;

import com.erchat.common.domain.APIResponse;
import com.erchat.user.service.ILoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/login")
@RequiredArgsConstructor
public class LoginController {

    private final ILoginService loginService;

    @PostMapping("/password")
    public APIResponse<String> loginOfPassword(String phone, String password){
        loginService.loginOfPassword(phone, password);
        return APIResponse.success("");
    }

    @PostMapping("/verification")
    public APIResponse<String> loginOfVerifyCode(String phone, String verifyCode){
        loginService.loginOfVerifyCode(phone, verifyCode);
        return APIResponse.success("");
    }
}
