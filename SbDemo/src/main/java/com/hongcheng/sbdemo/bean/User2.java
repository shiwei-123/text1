package com.hongcheng.sbdemo.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class User2 {
	
	private String name;
	
	@JsonIgnore//当前字段不被显示
	private String password;
	
	@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",locale="zh",timezone="GMT+8")
	private Date birthday;
	
	@JsonInclude(Include.NON_NULL)
	private String desc;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", birthday=" + birthday + ", desc=" + desc + "]";
	}
	/**
	 * 
	 */
	public User2() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param password
	 * @param birthday
	 * @param desc
	 */
	public User2(String name, String password, Date birthday, String desc) {
		super();
		this.name = name;
		this.password = password;
		this.birthday = birthday;
		this.desc = desc;
	}
	

}
