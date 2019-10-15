package com.inspur.assemble;

import java.util.List;

public class User {
	//无参构造
	public User() {
	}
	
	private String username;
	private Integer password;
	private List<String> list;
	//第一种基于XML的 setter设值注入，提供setter方法
//	public void setUsername(String username) {
//		this.username = username;
//	}
//	public void setPassword(Integer password) {
//		this.password = password;
//	}
//	public void setList(List<String> list) {
//		this.list = list;
//	}
	//有参构造
	public User(String uname,Integer pwd,List<String> list) {
		this.username = uname;
		this.password = pwd;
		this.list = list;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", list=" + list + "]";
	}
	
}
