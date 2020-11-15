package com.hzm.ioc.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年10月28日
 */
@Component
@PropertySource(value = "config/personConfig.properties")
public class PropertiesBean {

	@Value("${person.name}")
	private String name;

	@Value("${person.age}")
	private String age;

	private String addTest;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddTest() {
		return addTest;
	}

	public void setAddTest(String addTest) {
		this.addTest = addTest;
	}

	@PostConstruct
	private void setAddTest() {
		addTest = name + age;
	}

	public void say() {
		System.out.println(addTest);
	}

	@Override
	public String toString() {
		return "PropertiesBean{" +
				"name='" + name + '\'' +
				", age='" + age + '\'' +
				", addTest='" + addTest + '\'' +
				'}';
	}
}
