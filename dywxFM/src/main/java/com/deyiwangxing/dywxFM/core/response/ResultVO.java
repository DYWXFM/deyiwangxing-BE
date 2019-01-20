package com.deyiwangxing.dywxFM.core.response;

import java.io.Serializable;

/**
 * @Description: 返回对象实体
 * @author softtwilight
 * @vesion create on 2019/1/19
 */
public class ResultVO<T> {

    public int code;

    private String msg;

    private T data;


    public int getCode() {
        return code;
    }

    public ResultVO<T> setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public ResultVO<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return data;
    }

    public ResultVO<T> setData(T data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "ResultVO{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
