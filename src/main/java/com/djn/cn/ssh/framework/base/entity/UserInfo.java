package com.djn.cn.ssh.framework.base.entity;


import javax.persistence.Entity;
import javax.persistence.Table;
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
	private String password;
	private String realName;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
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
