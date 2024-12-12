package com.erchat.user.service.impl;

import com.erchat.user.service.ILoginService;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements ILoginService {
    @Override
    public String loginOfPassword(String phone, String password) {
        return null;
    }

    @Override
    public String loginOfVerifyCode(String phone, String verifyCode) {
        return null;
    }
}
