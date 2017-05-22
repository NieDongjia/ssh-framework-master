package com.djn.cn.ssh.framework.base.dao;

import java.io.Serializable;

/**
 * 
 * @ClassName IBaseDao
 * @Description  DAO 基接口
 * @author BigJia-Perfect
 * @date 2017年4月23日 下午4:33:35
 *
 * @param <T>
 * @param <PK>
 */
public interface IBaseDAO<T, PK extends Serializable> {  

  /** 
   * 根据ID获取实体对象. 
   *  
   * @param id 
   *            记录ID 
   * @return 实体对象 
   */  
   T get(PK id);  
    
  /** 
   * 保存实体对象. 
   *  
   * @param entity 
   *            对象 
   * @return ID 
   */  
   PK save(T entity);  
} 