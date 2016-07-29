package com.personal.rulengine.mamager.controller.result;

import java.io.Serializable;

/**
 * ErrorCode常量数值类
 * 
 * @author Liubao
 * @2015年3月18日
 * 
 */
public final class ErrorCodeConsField implements Serializable {

    private static final long serialVersionUID = 8789423033223487174L;

    private ErrorCodeConsField() {
    }

    // 参数为空!
    public static final String ERROR_MSG_10001 = "10001";
    // 操作不支持!
    public static final String ERROR_MSG_10002 = "10002";
    // 该车辆已经被预定,请重新选择!
    public static final String ERROR_MSG_10003 = "10003";
    // 更新状态失败!
    public static final String ERROR_MSG_10004 = "10004";
    //未知异常!
    public static final String ERROR_MSG_10005 = "10005";
}
