package com.erchat.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.erchat.user.mapper.UserMapper;
import com.erchat.user.model.User;
import com.erchat.user.service.ILoginService;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl extends ServiceImpl<UserMapper, User> implements ILoginService {
    @Override
    public User loginOfPassword(String phone, String password) {
        return lambdaQuery().eq(User::getNickName, phone).eq(User::getPassword, password).one();
    }

    @Override
    public String loginOfVerifyCode(String phone, String verifyCode) {
        return null;
    }
}
