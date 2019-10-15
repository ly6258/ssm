package com.inspur.annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("userService")//相当于在Annotation.xml<bean id="userService" class="..."/>
public class UserServiceImpl implements UserService {
	@Resource(name="userDao")//相当于 <bean id="userService" class=".."><property name="userDao" ref="userDao"></property</bean>
	private UserDao userDao;
	
	public void save() {
		System.out.println("Service ... save()...");
		userDao.save();
	}

}
