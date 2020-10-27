package com.hzm.ioc.bean;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年09月13日
 */
public class DemoBean1 {

	private String name;

	public DemoBean1() {
		name = "default" + DemoBean1.class.getSimpleName();
		System.out.println(name + " create NoArgs");
	}

	public DemoBean1(String name) {
		this.name = name;
		if (name == null) {
			name = "default" + DemoBean1.class.getSimpleName();
		}
		System.out.println(name + " create HasArgs");
	}

	public void say() {
		System.out.println(DemoBean1.class);
	}

	@Override
	public String toString() {
		return "DemoBean1{" +
				"name='" + name + '\'' +
				'}';
	}
}
