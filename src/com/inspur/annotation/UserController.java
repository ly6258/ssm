package com.inspur.annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

@Controller("userController")
public class UserController {
	@Resource(name="userService")
	private UserService userService;
	public void save() {
		System.out.println("Controller ... save()");
		userService.save();
	}
}
