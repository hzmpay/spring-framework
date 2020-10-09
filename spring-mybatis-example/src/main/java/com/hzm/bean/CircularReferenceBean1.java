package com.hzm.bean;

import javax.annotation.Resource;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年09月13日
 */
public class CircularReferenceBean1 {

	private String name;

	@Resource
	private CircularReferenceBean2 circularReferenceBean2;

	public CircularReferenceBean1() {
		name = "default" + CircularReferenceBean1.class.getSimpleName();
		System.out.println(name + " create NoArgs");
	}

	public CircularReferenceBean1(String name) {
		this.name = name;
		if (name == null) {
			name = "default" + CircularReferenceBean1.class.getSimpleName();
		}
		System.out.println(name + " create HasArgs");
	}

	public void say() {
		System.out.println(CircularReferenceBean1.class);
	}
}
