package com.erchat.user.service;

public interface ILoginService {

    String loginOfPassword(String phone, String password);

    String loginOfVerifyCode(String phone, String verifyCode);
}
