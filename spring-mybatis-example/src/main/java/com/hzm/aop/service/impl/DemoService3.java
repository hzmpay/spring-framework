package com.hzm.aop.service.impl;

import org.springframework.stereotype.Service;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年11月03日
 */
@Service
public class DemoService3 {

	public void a() {
		System.out.println(getClass() + "a执行了===========》");
	}

	public void b() {
		System.out.println(getClass() + "b执行了===========》");
	}

}
