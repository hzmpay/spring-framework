package com.hzm.ioc.ignore;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年09月29日
 */
public class IgnoreBean2 {

	private String name;

	public IgnoreBean2() {
		System.out.println("IgnoreBean2 init");
	}

	public IgnoreBean2(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void say() {
		System.out.println("IgnoreBean2 name is " + name);
	}
	
	
}
