package com.hzm.aop.bean;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年10月27日
 */
public class AspectJBean {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "AspectJBean{" +
				"name='" + name + '\'' +
				'}';
	}

	public String say() {
		return name;
	}
}
