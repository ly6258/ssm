package com.inspur.beans;

public class UserServiceImpl implements UserService {
	//在服务层 Service 层 调用 DAO层
	private UserDao ud;
	public UserServiceImpl() {
	}
	//带参的构造方法
	public UserServiceImpl(UserDao userDao) {
		this.ud = userDao;
	}

	@Override
	public void say() {
		System.out.println("UserService say Hello ");
		ud.say();
	}
//	//声明属性
//	private UserDao ud;
//	//为属性提供setter方法
//    public void setUd(UserDao ud) { this.ud = ud; }
//	 
//	
//	@Override
//	public void say() {
//		System.out.println("UserService say hello");
//		//获取依赖对象
//		ud.say();
////		UserDao ud = new UserDaoImpl();
////		ud.say();
//	}

	
}
