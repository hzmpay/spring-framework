package com.hzm.bean;

import javax.annotation.Resource;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年09月13日
 */
public class CircularReferenceBean2 {

	private String name;

	@Resource
	private CircularReferenceBean1 circularReferenceBean1;

	public CircularReferenceBean2() {
		name = "default" + CircularReferenceBean2.class.getSimpleName();
		System.out.println(name + " create NoArgs");
	}

	public CircularReferenceBean2(String name) {
		this.name = name;
		if (name == null) {
			name = "default" + CircularReferenceBean2.class.getSimpleName();
		}
		System.out.println(name + " create HasArgs");
	}

	public void say() {
		System.out.println(CircularReferenceBean2.class);
	}
}
