package com.deyiwangxing.dywxFM.core.exception;

/**
 * @author softtwilight
 * @vesion create on 2019/1/19
 */
public class ServiceException extends RuntimeException {

    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }


}
