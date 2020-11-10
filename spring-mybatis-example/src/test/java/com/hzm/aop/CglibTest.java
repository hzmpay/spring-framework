package com.hzm.aop;

import com.hzm.aop.interceptor.CglibMethodInterceptor;
import com.hzm.aop.service.impl.DemoService3;
import org.junit.jupiter.api.Test;
import org.springframework.cglib.proxy.Enhancer;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年11月05日
 */
public class CglibTest {

	@Test
	public void cglibTest() {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(DemoService3.class);
		enhancer.setCallback(new CglibMethodInterceptor());
		DemoService3 demoService3 = (DemoService3) enhancer.create();
		demoService3.a();
	}
}
