package com.hongcheng.sbdemo.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hongcheng.sbdemo.bean.User;

@Controller
public class HelloController2 {
	//返回jason数据格式的数据
	@RequestMapping("getUsers01")
	@ResponseBody
	public User getUsers() {
		User user = new User();
		user.setBirthday(new Date());
		user.setDesc("天降大狗");
		user.setName("一女子");
		user.setPassword("123456");
		return user;
	}
	
	

}
