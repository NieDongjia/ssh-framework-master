package com.djn.cn.ssh.framework.base.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



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
	@RequestMapping("index")
	public String toIndex() {
		return "/index";
	}
}
