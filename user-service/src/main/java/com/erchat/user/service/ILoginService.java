package com.erchat.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.erchat.user.model.User;

public interface ILoginService extends IService<User> {

    User loginOfPassword(String username, String password);

    String loginOfVerifyCode(String phone, String verifyCode);
}
