package com.djn.cn.ssh.framework.base.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
/**
 * 
 * @ClassName RoleInfo
 * @Description  系统角色表  
 * @author BigJia-Perfect
 * @date 2017年4月30日 下午11:54:44
 *
 */
@Entity
@Table(name = "T_BD_RoleInfo")
public class RoleInfo extends BaseEntity{
	private static final long serialVersionUID = 1L;
	/** 角色下所有用户*/

	private Set<UserInfo> userInfos = new HashSet<UserInfo>(0);
	@ManyToMany
	@JoinTable(
		name="T_UserInfo_RoleInfo"
		, joinColumns={
			@JoinColumn(name="FRoleInfoID")
			}
		, inverseJoinColumns={
			@JoinColumn(name="FUserInfoID")
			}
		)
	public Set<UserInfo> getUserInfos() {
		return userInfos;
	}
	public void setUserInfos(Set<UserInfo> userInfos) {
		this.userInfos = userInfos;
	}
	@Override
	public String toString() {
		return "RoleInfo [userInfos=" + userInfos + "]";
	}
}
