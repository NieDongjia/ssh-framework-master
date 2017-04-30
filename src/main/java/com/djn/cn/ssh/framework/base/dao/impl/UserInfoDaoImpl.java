package com.djn.cn.ssh.framework.base.dao.impl;

import org.springframework.stereotype.Repository;

import com.djn.cn.ssh.framework.base.dao.IUserInfoDao;
import com.djn.cn.ssh.framework.base.entity.UserInfo;
@Repository
public class UserInfoDaoImpl extends BaseDaoImpl<UserInfo, String> implements IUserInfoDao {
}
