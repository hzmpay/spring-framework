package com.hzm.bean;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年09月13日
 */
public class DemoBean1 {

	private String name;

	public DemoBean1() {
		name = "default" + DemoBean1.class.getSimpleName();
		System.out.println(getClass() + " create");
	}

	public DemoBean1(String name) {
		this.name = name;
		if (name == null) {
			name = "default" + DemoBean1.class.getSimpleName();
		}
		System.out.println(getClass() + " create");
	}

	public void say() {
		System.out.println(DemoBean1.class);
	}
}
