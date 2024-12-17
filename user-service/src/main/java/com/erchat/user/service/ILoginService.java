package com.erchat.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.erchat.user.dto.LoginDTO;
import com.erchat.user.model.User;

public interface ILoginService extends IService<User> {

    User loginOfPassword(LoginDTO loginDTO);

    String loginOfVerifyCode(String phone, String verifyCode);
}
