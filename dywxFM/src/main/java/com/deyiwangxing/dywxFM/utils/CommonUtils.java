package com.deyiwangxing.dywxFM.utils;

import com.deyiwangxing.dywxFM.core.response.ResponseCode;
import com.deyiwangxing.dywxFM.core.response.ResultVO;

/**
 * @Description: 返回VO 工具类
 * @author softtwilight
 * @vesion create on 2019/1/19
 */
public class CommonUtils {
    private final static String SUCCESS = "success";
    private final static String DEFAULT_DATA = "{}";

    public static ResultVO emptySuccess() {
        return new ResultVO().setCode(ResponseCode.SUCCESS.code)
                .setMsg(SUCCESS).setData(DEFAULT_DATA);
    }


    public static <T> ResultVO<T> success(T data) {
        return new ResultVO().setCode(ResponseCode.SUCCESS.code)
                .setMsg(SUCCESS).setData(data);
    }


    public static ResultVO error(String msg) {
        return new ResultVO().setCode(ResponseCode.FAIL.code)
                .setMsg(msg).setData(DEFAULT_DATA);
    }

    public static <T> ResultVO<T> response(int code, String msg) {
        return new ResultVO().setCode(code)
                .setMsg(msg).setData(DEFAULT_DATA);
    }

    public static <T> ResultVO<T> response(int code, String msg, T data) {
        return new ResultVO().setCode(code)
                .setMsg(msg).setData(data);
    }

}
