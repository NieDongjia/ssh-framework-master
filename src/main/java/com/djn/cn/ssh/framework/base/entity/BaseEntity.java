package com.djn.cn.ssh.framework.base.entity;

import java.io.Serializable;  
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;  
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

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
	/** ID */
    private String id;  
    /**  创建日期  */ 
    private Date createDate;  
    /**  最后修改日期 */  
    private Date lastUpdateTime;  
    /** 描述 */
    private String description;
    /** 名称*/
    private String name;
    /**创建者*/
    private UserInfo creator;
    /**最后修改者*/
    private UserInfo lastUpdateUser;
    @Id  
    @Column(name="FID",length = 36, nullable = true)  
    @GeneratedValue(generator = "uuid")  
    @GenericGenerator(name = "uuid", strategy = "uuid")  
    public String getId() {  
        return id;  
    }  
  
    public void setId(String id) {  
        this.id = id;  
    }  
  
    @Column(name="FCreateDate",updatable = false)  
    public Date getCreateDate() {  
        return createDate;  
    }  
  
    public void setCreateDate(Date createDate) {  
        this.createDate = createDate;  
    }  
	@Column(name="FLastUpdateTime")
    public Date getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	@Column(name="FName")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Column(name="FDescription")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
    @OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="FCreatorID")
    public UserInfo getCreator() {
		return creator;
	}
	public void setCreator(UserInfo creator) {
		this.creator = creator;
	}
    @OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="FLastUpdateUserID")
	public UserInfo getLastUpdateUser() {
		return lastUpdateUser;
	}
	public void setLastUpdateUser(UserInfo lastUpdateUser) {
		this.lastUpdateUser = lastUpdateUser;
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