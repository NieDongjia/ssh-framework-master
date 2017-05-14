package com.djn.cn.ssh.framework.base.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import com.djn.cn.ssh.framework.base.dao.IBaseDao;
import com.djn.cn.ssh.framework.base.service.IBaseService;

public class BaseServiceImpl<T, PK extends Serializable> implements IBaseService<T, PK>{  
	@Autowired
    private IBaseDao<T, PK> baseDao;  
      
    public IBaseDao<T, PK> getBaseDao() {  
        return baseDao;  
    }  
      
    public void setBaseDao(IBaseDao<T, PK> baseDao) {  
        this.baseDao = baseDao;  
    }  
    public T get(PK id) {  
        return baseDao.get(id);  
    }  
      
    public PK save(T entity) {  
        return baseDao.save(entity);  
    }  
  
}  
