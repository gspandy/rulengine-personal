package com.personal.rulengine.dao.base;

import java.util.List;
import java.util.Map;

import com.personal.rulengine.common.entity.BaseEntity;



/**
 * DAO基础类
 * 
 * @author Liubao
 * @2015年8月5日
 * 
 */
@MyBatisRepository
public interface GenericDAO<E extends BaseEntity> {

    List<E> selectAll();
    
    long selectAllCount();
    
    List<E> selectAll(boolean ignoreFlag);
    
    long selectAllCount(boolean ignoreFlag);
    
    List<E> selectByPageQuery(Map<String,Object> param);
    
    long selectByPageQueryCount(Map<String,Object> param);
    
    List<E> selectByPageQuery(Map<String,Object> param,boolean ignoreFlag);
    
    long selectByPageQueryCount(Map<String,Object> param,boolean ignoreFlag);
    
    List<E> selectByPageQuery(Map<String,Object> param,Integer pageIndex ,Integer pageSize);
    
    List<E> selectByPageQuery(Map<String,Object> param,Integer pageIndex ,Integer pageSize,boolean ignoreFlag);

    E findById(Long id);
    
    E findById(Long id, boolean ignoreFlag);

    E findByCode(String code);

    E findByCode(String code, boolean ignoreFlag);

    List<E> findByCode(List<String> codeList);
    
    List<E> findByCode(List<String> codeList, boolean ignoreFlag);
    
    List<E> findById(List<Long> idList);
    
    List<E> findById(List<Long> idList, boolean ignoreFlag);

    int insert(E entity);

    void insert(List<E> entities);

    int update(E entity);

    int updateWithMap(Map<String,Object> paramMap,Map<String, Object> conditMap);
    
    int update(List<E> entities);

    int deleteById(Long id);

    int deleteByCode(String code);

    int delete(E entity);

    int delete(List<E> entities);

    int deleteByIdList(List<Long> idList);

    int deleteByCodeList(List<String> codeList);

    int deletePhysicalByIdList(List<Long> idList);

    int deletePhysicalByCodeList(List<String> codeList);

}
