package com.hzm.ioc.propertiesConfig;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年10月21日
 */
public class DemoPerson {

	private String name;

	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "DemoPerson{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
