package com.hyx.recordmoney.module.exception;

import com.sunsharing.share.common.base.exception.ResponseCode;
import com.sunsharing.share.common.base.exception.ShareBusinessException;

/**
 * 业务异常响应代码的枚举类，在此统一定义异常代码
 */
public enum ModuleResponseCode implements ResponseCode {
    ACCOUNT_EXISTS(1901, "已经存在此登录账号");

    private int code;
    private String message;

    ModuleResponseCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    public ShareBusinessException exception() {
        return new ShareBusinessException(this);
    }

}
