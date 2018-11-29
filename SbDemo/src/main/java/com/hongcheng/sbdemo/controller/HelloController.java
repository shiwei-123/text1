package com.hongcheng.sbdemo.controller;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hongcheng.sbdemo.bean.Resource;
import com.hongcheng.sbdemo.bean.User;
import com.hongcheng.sbdemo.bean.User2;

@RestController
public class HelloController {
	
	@RequestMapping("hello")
	public Object hello() {
		
		return "hello  springboot~~~";
	}
	
	@RequestMapping("getUsers02")
	public User getUsers() {
		User user = new User();
		user.setBirthday(new Date());
		user.setDesc("天降大狗");
		user.setName("一女子");
		user.setPassword("123456");
		return user;
	}
	
	@RequestMapping("getUsers03")
	public User2 getUsers3() {
		User2 user = new User2();
		user.setBirthday(new Date());
		user.setDesc("免疫艾滋病婴儿未经医学伦理报备");
		user.setName("田狗");
		user.setPassword("123456");
		return user;	
	}
	
	@Autowired
	private Resource resource;
	
	@RequestMapping("/getResource")
	private Resource getResource() {
		Resource bean = new Resource();
		BeanUtils.copyProperties(resource, bean);
		return bean;
	}
	
	
	

}
