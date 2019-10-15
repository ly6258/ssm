package com.inspur.annotation;

import org.springframework.stereotype.Repository;

@Repository("userDao")//相当于在Annotation。xml  <bean id="userDao" class="..."/> 
public class UserDaoImpl implements UserDao {

	@Override
	public void save() {
		System.out.println("DAO...save()...");
	}

}
