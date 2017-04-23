package com.djn.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.djn.cn.ssh.framework.base.entity.UserInfo;
import com.djn.cn.ssh.framework.base.service.IUserInfoService;
import com.djn.cn.ssh.framework.base.util.EncryptUtil;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-hibernate.xml" }) 
public class UserInfoServiceTest {
    @Autowired  
    private IUserInfoService iUserInfoService;  
    @Test
    public void save(){
    	UserInfo userInfo = new UserInfo();
    	userInfo.setName("NieDongjia5");
    	userInfo.setPassword(EncryptUtil.encryptToMD5("123654"));
    	System.out.println(iUserInfoService.save(userInfo));
    }
}
