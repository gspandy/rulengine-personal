package com.personal.rulengine.mamager.controller.result;

/**
 * 返回失败的结果集
 * 
 * @author Liubao
 * @2015年3月18日
 * 
 */
public class ResultErrorInfo extends ResultInfo {

    public ResultErrorInfo() {
        super(ResultInfoUtil.ERROR);
    }

    public ResultErrorInfo(String errorCode, String errorMessage) {
        super(errorCode, errorMessage);
    }

}
