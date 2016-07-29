package com.personal.rulengine.common.constant;

import org.apache.commons.lang.StringUtils;

/**
 * 
 * @Author LiuBao
 * @Version 0.1
 * @Comp personal
 * @Date 2016年7月15日下午1:50:28
 *
 */
public enum CompareOper {

    /** 大于   */
    GT(">"), 
    
    /**大于等于 */
    GE(">="),
    
    /**小于*/
    LT("<"),
    
    /** 小于等于 */
    LE("<="),
    
    /** 等于 */
    EQ("=="), 
    
    /** 不等于*/
    NE("!="), 
    
    /** 包含 */
    CO("contains"),
    
    /** 不包含*/
    NCO("not contains"),
    
    /** 属于 */
    MF("memberOf"), 
    
    /** 不属于 */
    NMF("not memberOf"), 
    
    /** 匹配 */
    MA("matches"), 
    
    /** 不匹配 */
    NMA("not matches");

    /** 操作类型  */
    private String oper;

    /**
     * 操作描述
     * @param oper
     */
    private CompareOper(String oper) {
        this.oper = oper;
    }

    /**
     * @return the oper
     */
    public String getText() {
        return oper;
    }

    /**
     * @param oper the oper to set
     */
    public void setOper(String oper) {
        this.oper = oper;
    }

    /**
     * 
     * 功能描述: <br>
     * 根据入参：oper返回对应的枚举
     * 
     * @param oper
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    public static CompareOper toObject(String oper) {
        if (StringUtils.isEmpty(oper)) {
            return null;
        }
        for (CompareOper compareOper : CompareOper.values()) {
            if (compareOper.getText().equals(oper.trim())) {
                return compareOper;
            }
        }
        return null;
    }
}
