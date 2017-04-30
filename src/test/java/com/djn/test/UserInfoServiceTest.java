package com.djn.test;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.djn.cn.ssh.framework.base.entity.UserInfo;
import com.djn.cn.ssh.framework.base.service.IUserInfoService;
import com.djn.cn.ssh.framework.base.util.EncryptUtil;

@SuppressWarnings("unused")
@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-hibernate.xml" }) 
public class UserInfoServiceTest {
    @Autowired  
    private IUserInfoService iUserInfoService;  
 
    @Test
    public void save(){
  

    	// 8ad382cf5bbe5e6d015bbe5e72090000
    	UserInfo admin = iUserInfoService.get("8ad382cf5bbec719015bbec71f720000");
    	System.out.println(admin);
      	UserInfo userInfo = new UserInfo();
    	userInfo.setName("niedongjia");
    	userInfo.setPassword(EncryptUtil.encryptToMD5("123456"));
    	userInfo.setRealName("聂冬佳");
    	userInfo.setCreator(admin);
    	userInfo.setLastUpdateUser(admin);
    	System.out.println(iUserInfoService.save(userInfo)); // 8ad382cf5bbec8e3015bbec8e7ab0000
//    	
    }
    @Test
    public void get(){
    	
    	
    	// 8ad382cf5bbe5e6d015bbe5e72090000
    	UserInfo admin = iUserInfoService.get("8ad382cf5bbec8e3015bbec8e7ab0000");
    	System.out.println(admin);
    	System.out.println(admin.getCreator());
    	System.out.println(admin.getLastUpdateUser());
//    	UserInfo userInfo = new UserInfo();
//    	userInfo.setName("niedongjia");
//    	userInfo.setPassword(EncryptUtil.encryptToMD5("123456"));
//    	userInfo.setRealName("聂冬佳");
//    	userInfo.setCreator(admin);
//    	userInfo.setLastUpdateUser(admin);
//    	System.out.println(iUserInfoService.save(userInfo)); // 8ad382cf5bbec8e3015bbec8e7ab0000
//    	
    }
}
