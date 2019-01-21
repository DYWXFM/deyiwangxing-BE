package com.deyiwangxing.dywxFM.core.response;

/**
 * @author softtwilight
 * @vesion create on 2019/1/19
 */
public enum ResponseCode {
    // 成功
    SUCCESS(200),

    // 失败
    FAIL(400),

    // 未认证（签名错误）
    UNAUTHORIZED(401),

    /** 未登录 */
    UNAUTHEN(4401),

    /** not found */
    NOT_FOUND(404),

    /** 未授权，拒绝访问 */
    UNAUTHZ(403),

    // 服务器内部错误
    INTERNAL_SERVER_ERROR(500);

    public int code;

    ResponseCode(int code) {
        this.code = code;
    }

}
