package com.hongcheng.sbdemo.bean;

import java.util.Date;

public class User {
	private String name;
	private String password;
	private Date birthday;
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
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param password
	 * @param birthday
	 * @param desc
	 */
	public User(String name, String password, Date birthday, String desc) {
		super();
		this.name = name;
		this.password = password;
		this.birthday = birthday;
		this.desc = desc;
	}
	

}
