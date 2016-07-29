package com.personal.rulengine.service.base;

import java.util.List;
import java.util.Map;

import com.personal.rulengine.common.entity.BaseEntity;
import com.personal.rulengine.common.viewobject.BaseViewObject;


/**
 * 服务层基类接口
 * 
 * @param <V>
 *            BaseViewObject子视图类型
 * @param <E>
 *            BaseEntity子实体类型
 * 
 */
public interface GenericService<V extends BaseViewObject<V>, E extends BaseEntity> {
//public interface GenericService<V extends BaseViewObject<?>, E extends BaseEntity> {
    
    List<V> getAll();
    
    long getAllCount();
    
    List<V> getAll(boolean ignoreFlag);
    
    long getAllCount(boolean ignoreFlag);
    
    List<V> getByPageQuery(Map<String,Object> param);
    
    long getByPageQueryCount(Map<String,Object> param);
    
    List<V> getByPageQuery(Map<String,Object> param,boolean ignoreFlag);
    
    long getByPageQueryCount(Map<String,Object> param,boolean ignoreFlag);
    
    List<V> getByPageQuery(Map<String,Object> param,Integer pageIndex ,Integer pageSize);
    
    List<V> getByPageQuery(Map<String,Object> param,Integer pageIndex ,Integer pageSize,boolean ignoreFlag);

    public V getById(Long id ,boolean ignoreFlag);
    
    public List<V> getByIdList(List<Long> idList , boolean ignoreFlag);
    
    public V getById(Long id);
    
    public List<V> getByIdList(List<Long> idList);

    public V getByCode(String code);

    public List<V> getByCodeList(List<String> codes);
    
    public V getByCode(String code , boolean ignoreFlag);
    
    public List<V> getByCodeList(List<String> codes , boolean ignoreFlag);

    public int deleteById(Long id);

    public int deleteByIdList(List<Long> idList);
    
    public int deleteByCode(String code);

    public int deleteByCodeList(List<String> codeList);
    
    public boolean save(V viewObject);

    public void save(List<V> viewObjects);

//    @Deprecated
    public boolean insert(V viewObject);

//    @Deprecated
    public void insert(List<V> viewObjects);

}
