package com.inpsur.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.inspur.annotation.UserController;
import com.inspur.beans.UserDao;
import com.inspur.beans.UserDaoImpl;
import com.inspur.beans.UserService;
import com.inspur.beans.UserServiceImpl;

public class TestUser {
	//不使用spring框架之前
	@Test
	public void saytest() {
		UserDao ud = new UserDaoImpl();
		UserService us = new UserServiceImpl();
		us.say();
		
	}
	
	//使用 Spring框架之后， 不需要自己new 对象
	@Test
	public void springsayTest() {
		//获取spring的核心容器 ApplicationContext
		ApplicationContext app = new ClassPathXmlApplicationContext("application.xml");
		UserService us = (UserServiceImpl)app.getBean("userService");
		us.say();
//		UserDao ud = (UserDaoImpl)app.getBean("userDao");
//		ud.say();
//		ud.say();
	}
	/*
	 * 构造器实例化 Bean
	 */
	@Test
	public void testBean01() {
		ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println(app.getBean("bean01"));
	}
	/*
	 * 静态工厂实例化 Bean
	 */
	@Test
	public void testBean02() {
		ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println(app.getBean("bean02"));
	}
	/*
	 * 实例工厂实例化 Bean
	 */
	@Test
	public void testBean03() {
		ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println(app.getBean("bean03"));
	}
	
	/*
	 * Bean作用域singleton
	 */
	@Test
	public void testBean04() {
		ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println(app.getBean("bean04"));
		System.out.println(app.getBean("bean04"));
	}
	/*
	 * Bean作用域prototype
	 */
	@Test
	public void testBean05() {
		ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println(app.getBean("bean04"));
		System.out.println(app.getBean("bean04"));
	}
	/*
	 * 装配一：基于XML的setter设值注入
	 */
	@Test
	public void testAssmeble01() {
		ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println(app.getBean("user01"));
	}
	/*
	 * 装配一：基于XML的构造方法入
	 */
	@Test
	public void testAssmeble02() {
		ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println(app.getBean("user02"));
	}
	/*
	 * 装配二：基于Annotation
	 */
	@Test
	public void testAnnotation() {
		ApplicationContext app = new ClassPathXmlApplicationContext("bean1.xml");
		UserController uc  = (UserController)app.getBean("userController");
		uc.save();
	}
	
}
