package com.djn.cn.ssh.framework.base.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.djn.cn.ssh.framework.base.entity.UserInfo;
import com.djn.cn.ssh.framework.base.service.IUserInfoService;



/**
 * 
 * @ClassName IndexController
 * @Description IndexController
 * @author BigJia-Perfect
 * @date 2017年4月23日 下午10:47:54
 *
 */
@Controller
public class IndexController extends BaseController {
    @Autowired  
    private IUserInfoService iUserInfoService;  
	@RequestMapping("index")
	public String toIndex() {               
//    	UserInfo admin = iUserInfoService.get("402801815bbfb8e8015bbfb8f0730000");
//    	System.out.println(admin);
//    	System.out.println(admin.getCreator());
//    	System.out.println(admin.getLastUpdateUser());
		return "/index";
	}
}
