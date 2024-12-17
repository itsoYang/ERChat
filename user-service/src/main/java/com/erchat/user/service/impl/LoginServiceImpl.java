package com.erchat.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.erchat.user.dto.LoginDTO;
import com.erchat.user.mapper.UserMapper;
import com.erchat.user.model.User;
import com.erchat.user.service.ILoginService;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl extends ServiceImpl<UserMapper, User> implements ILoginService {
    @Override
    public User loginOfPassword(LoginDTO loginDTO) {
        return lambdaQuery().eq(User::getUsername, loginDTO.getUsername()).eq(User::getPassword, loginDTO.getPassword()).one();
    }

    @Override
    public String loginOfVerifyCode(String phone, String verifyCode) {
        return null;
    }
}
