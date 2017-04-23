package com.djn.cn.ssh.framework.base.entity;

import java.io.Serializable;  
import java.util.Date;  
  
import javax.persistence.Column;  
import javax.persistence.GeneratedValue;  
import javax.persistence.Id;  
import javax.persistence.MappedSuperclass;  
  
import org.hibernate.annotations.GenericGenerator;  
  

/**
 * 
 * @ClassName BaseEntity
 * @Description  实体类 - 基类 
 * @author BigJia-Perfect
 * @date 2017年4月23日 下午4:48:16
 *
 */
@MappedSuperclass  
public class BaseEntity implements Serializable{  
	private static final long serialVersionUID = 1L;
	/** 
     * ID 
     */  
    private String id;  
    /** 
     * 创建日期 
     */  
    private Date createDate;  
    /** 
     * 修改日期 
     */  
    private Date modifyDate;  
      
    @Id  
    @Column(length = 36, nullable = true)  
    @GeneratedValue(generator = "uuid")  
    @GenericGenerator(name = "uuid", strategy = "uuid")  
    public String getId() {  
        return id;  
    }  
  
    public void setId(String id) {  
        this.id = id;  
    }  
  
    @Column(updatable = false)  
    public Date getCreateDate() {  
        return createDate;  
    }  
  
    public void setCreateDate(Date createDate) {  
        this.createDate = createDate;  
    }  
  
    public Date getModifyDate() {  
        return modifyDate;  
    }  
  
    public void setModifyDate(Date modifyDate) {  
        this.modifyDate = modifyDate;  
    }  
  
    @Override  
    public int hashCode() {  
        return id == null ? System.identityHashCode(this) : id.hashCode();  
    }  
  
    @Override  
    public boolean equals(Object obj) {  
        if (this == obj) {  
            return true;  
        }  
        if (obj == null) {  
            return false;  
        }  
        if (getClass().getPackage() != obj.getClass().getPackage()) {  
            return false;  
        }  
        final BaseEntity other = (BaseEntity) obj;  
        if (id == null) {  
            if (other.getId() != null) {  
                return false;  
            }  
        } else if (!id.equals(other.getId())) {  
            return false;  
        }  
        return true;  
    }  
}  