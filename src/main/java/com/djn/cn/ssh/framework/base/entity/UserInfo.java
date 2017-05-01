package com.djn.cn.ssh.framework.base.entity;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
/**
 * 
 * @ClassName UserInfo
 * @Description  用户实体
 * @author BigJia-Perfect
 * @date 2017年4月23日 下午5:01:54
 *
 */
@Entity
@Table(name = "T_BD_UserInfo")
public class UserInfo extends BaseEntity{
	private static final long serialVersionUID = 1L;
	/** 密码*/
	private String password;
	/** 真实姓名*/
	private String realName;
	/** 用户角色*/
	private Set<RoleInfo> roleInfos = new HashSet<RoleInfo>(0);
	@ManyToMany
	@JoinTable(
		name="T_UserInfo_RoleInfo"
		, joinColumns={
			@JoinColumn(name="FUserInfoID")
			}
		, inverseJoinColumns={
			@JoinColumn(name="FRoleInfoID")
			}
		)
	public Set<RoleInfo> getRoleInfos() {
		return roleInfos;
	}
	public void setRoleInfos(Set<RoleInfo> roleInfos) {
		this.roleInfos = roleInfos;
	}
	@Column(name="FPassword")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name="FRealName")
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	@Override
	public String toString() {
		return "UserInfo [password=" + password + ", realName=" + realName + "]";
	}
}
