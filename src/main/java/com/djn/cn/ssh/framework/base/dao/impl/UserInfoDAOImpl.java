package com.djn.cn.ssh.framework.base.dao.impl;

import org.springframework.stereotype.Repository;

import com.djn.cn.ssh.framework.base.dao.IUserInfoDAO;
import com.djn.cn.ssh.framework.base.entity.UserInfo;
@Repository
public class UserInfoDAOImpl extends BaseDAOImpl<UserInfo, String> implements IUserInfoDAO {
}
