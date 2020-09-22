package com.hzm.bean;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年09月13日
 */
public class DemoBean1 {

	public DemoBean1() {
		System.out.println(getClass() + " create");
	}

	public void say() {
		System.out.println(DemoBean1.class);
	}
}
