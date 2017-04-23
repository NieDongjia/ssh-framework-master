package com.djn.cn.ssh.framework.base.controller;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.MessageSource;
/**
 * 
 * @ClassName BaseController
 * @Description 基本Controller
 * @author BigJia-Perfect
 * @date 2017年4月23日 下午10:34:50
 *
 */
public class BaseController {
	@Resource
	protected HttpServletRequest request;
	@Resource
	protected ServletContext application;
	@Resource
	protected HttpServletResponse response;
	@Resource
	private MessageSource messageSource;
}
