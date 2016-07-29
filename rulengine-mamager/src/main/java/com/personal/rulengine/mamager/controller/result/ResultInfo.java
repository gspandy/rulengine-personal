package com.personal.rulengine.mamager.controller.result;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 返回的结果集基类
 * 
 * @author Liubao
 * @2015年3月18日
 * 
 */
public abstract class ResultInfo {

    @JsonProperty("errorCode")
    private String errorCode;
    
    @JsonProperty("errorMsg")
    private String errorMessage;

    public ResultInfo() {
    }

    public ResultInfo(String errorCode) {
        this.errorCode = errorCode;
    }

    public ResultInfo(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}
