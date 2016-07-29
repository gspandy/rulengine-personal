package com.personal.rulengine.mamager.controller.result;

import java.util.List;

public class PageListUtil {
	/**
	 * 默认的起始页
	 */
	public static final int DEFAULT_PAGE_INDEX=1;
	
	/**
	 * 默认的分页显示数量
	 */
	public static final int DEFAULT_PAGE_SIZE=10;
	//public static final String PAGE_NO_NAME="pageNo";
	//public static final String PAGE_SIZE_NAME="pageSize";
	
    /**
     * 不关心总记录数
     * @param pageIndex
     * @param pageSize
     * @return
     */
    public static int getPageListStart(int pageIndex, int pageSize) {
        return (pageIndex - 1) * pageSize;
    }
    
    /**
     * 计算分页获取数据时游标的起始位置
     * @param totalCount
     * @param pageIndex
     * @param pageSize
     * @return
     */
    public static int getPageListStart(int totalCount, int pageIndex, int pageSize) {
        int start = (pageIndex - 1) * pageSize;
        if (start >= totalCount)
            start = 0;
        return start;
    }

    /**
     * 构造分页List对象
     * @param totalCount
     * @param pageIndex
     * @param items
     * @param pageSize
     * @return
     */
    public static <Entity> ResultInfoList<Entity> getPageList(int totalCount, int pageIndex, int pageSize, List<Entity> items) {
        return new ResultInfoList<Entity>(totalCount, pageIndex, pageSize, items);
    }
    
}
