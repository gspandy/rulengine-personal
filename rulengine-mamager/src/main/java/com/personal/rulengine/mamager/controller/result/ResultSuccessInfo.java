package com.personal.rulengine.mamager.controller.result;

import java.util.HashMap;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 返回成功的结果集
 * 
 * @author Liubao
 * @2015年3月18日
 * 
 */
public class ResultSuccessInfo extends ResultInfo {
    /***
     * 返回标识
     */
//    private String errorCode = ResultInfoUtil.SUCCESS;
    /***
     * 返回对象
     */
    private Object result;
    
    @JsonProperty("totalPages")
    @JSONField(serialize = false)
    private long totalPages;
    
    public ResultSuccessInfo() {
        super();
    }

    public ResultSuccessInfo(Object result) {
        super(ResultInfoUtil.SUCCESS);
        this.result = result;

    }

    public ResultSuccessInfo(String errorCode, Object result) {
        super(ResultInfoUtil.SUCCESS);
        this.result = result;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        if (result == null) {
            this.result = new HashMap<String, Object>();
            return;
        }
        this.result = result;
    }

    public long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(long totalPages) {
        this.totalPages = totalPages;
    }

}
