package com.hzm.ignore;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年09月29日
 */
@Component
public class IgnoreBean1 {

	private String name;

	public IgnoreBean1() {
		System.out.println("IgnoreBean1 init");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void say() {
		System.out.println("IgnoreBean1 name is " + name);
	}

	@Bean
	public IgnoreBean2 setIgnoreBean2() {
		return new IgnoreBean2();
	}

}
