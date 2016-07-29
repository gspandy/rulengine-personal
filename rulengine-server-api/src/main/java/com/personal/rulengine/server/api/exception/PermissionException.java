package com.personal.rulengine.server.api.exception;

/**
 * 权限异常类
 * 
 */
public class PermissionException extends RuntimeException {

    private static final long serialVersionUID = -6008004025445496953L;

    public PermissionException(String msg) {
        super(msg);
    }
    
    public PermissionException(String errorCode, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    private String errorCode;
    private String errorMessage;

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

}
