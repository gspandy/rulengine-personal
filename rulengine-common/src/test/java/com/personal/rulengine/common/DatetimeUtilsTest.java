package com.personal.rulengine.common;

import java.sql.Timestamp;

import org.junit.Test;

import com.personal.rulengine.common.utils.DatetimeUtils;

/**
 * DatetimeUtils测试类
 * 
 * @Author LiuBao
 * @Version 0.1
 * @Comp personal
 * @Date 2016年7月15日下午2:13:56
 * 
 */
public class DatetimeUtilsTest {
    
    public static void main(String[] args) {
        Timestamp weekPlus = DatetimeUtils.weekPlus(
                DatetimeUtils.createSpecialDateTime(DatetimeUtils.currentTimestamp(), null, 23, 59, 59), 2);
        System.out.println(DatetimeUtils.formatDate(weekPlus));
        
        String firstDayStr = DatetimeUtils.getNextWeekFirstDayStr(DatetimeUtils.currentTimestamp(), DatetimeUtils.DATETIME_PATTERN);
        System.out.println(firstDayStr);
        
        firstDayStr = DatetimeUtils.getNextWeekFirstDayStr(DatetimeUtils.dayPlus(DatetimeUtils.currentTimestamp(),3),DatetimeUtils. DATETIME_PATTERN);
        System.out.println(firstDayStr);
        
    }
    
    @Test
    public void testName() throws Exception {
        System.out.println(DatetimeUtils.currentTimestamp());
        System.out.println(DatetimeUtils.millSecondPlus(DatetimeUtils.currentTimestamp(), 2000));
        System.out.println(DatetimeUtils.secondPlus(DatetimeUtils.currentTimestamp(), 10));
        System.out.println(DatetimeUtils.minitePlus(DatetimeUtils.currentTimestamp(), 1));
        System.out.println(DatetimeUtils.hourPlus(DatetimeUtils.currentTimestamp(), -1));
    }
    
    

}
