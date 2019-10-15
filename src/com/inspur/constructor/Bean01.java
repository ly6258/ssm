package com.inspur.constructor;

public class Bean01 {
	//默认无参构造器
	public Bean01() {
	}

	@Override
	public String toString() {
		return "Bean01 [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
