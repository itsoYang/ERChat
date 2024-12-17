package com.erchat.user.controller;

import com.erchat.common.domain.APIResponse;
import com.erchat.user.dto.LoginDTO;
import com.erchat.user.model.User;
import com.erchat.user.service.ILoginService;
import com.erchat.user.utils.JwtTool;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;

@Slf4j
@RestController()
@RequestMapping("/login")
@RequiredArgsConstructor
public class LoginController {

    private final ILoginService loginService;

	private final PasswordEncoder passwordEncoder;

    private final JwtTool jwtTool;

    @PostMapping("/password")
    public APIResponse<String> loginOfPassword(@RequestBody LoginDTO loginDTO){
        log.info("phone:{},password:{}", loginDTO.getUsername(), loginDTO.getPassword());
        User user = loginService.lambdaQuery().eq(User::getUsername, loginDTO.getUsername()).one();
        if (user == null){
            return APIResponse.error("用户不存在");
        }
		if (!passwordEncoder.matches(loginDTO.getPassword(), user.getPassword())){
			return APIResponse.error("密码错误");
		}
        String token = jwtTool.createToken(user.getId(), Duration.ofDays(1));
		log.info("token:{}", token);
        return APIResponse.success("登录成功", token);
    }

    @PostMapping("/verification")
    public APIResponse<String> loginOfVerifyCode(String phone, String verifyCode){
        loginService.loginOfVerifyCode(phone, verifyCode);
        return APIResponse.success("");
    }
}
