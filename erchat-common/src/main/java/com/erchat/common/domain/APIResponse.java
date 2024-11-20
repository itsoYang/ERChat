package com.erchat.common.domain;

import com.erchat.common.exception.CommonException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class APIResponse<T> {
    private boolean success; // 请求是否成功
    private String message;  // 返回的消息
    private int code;        // 状态码
    private T data;         // 返回的数据

    public static <T> APIResponse<T> success() {
        return new APIResponse<>(true, "OK",200, null);
    }

    public static <T> APIResponse<T> success(String msg) {
        return new APIResponse<>(true, msg,200, null);
    }

    public static <T> APIResponse<T> success(String msg, T data) {
        return new APIResponse<>(true, msg,200, data);
    }

    public static <T> APIResponse<T> success(T data) {
        return new APIResponse<>(true, "OK",200, data);
    }

    public static <T> APIResponse<T> error(String msg) {
        return new APIResponse<>(false, msg,500, null);
    }

    public static <T> APIResponse<T> error(int code, String msg) {
        return new APIResponse<>(false, msg, code, null);
    }

    public static <T> APIResponse<T> error(CommonException e) {
        return new APIResponse<>(false, e.getMessage(), e.getCode(), null);
    }
}
