package com.hzm.aop;

import com.hzm.aop.config.AspectJServiceConfig;
import com.hzm.aop.config.InterceptorConfig;
import com.hzm.aop.interceptor.DemoMethodInterceptor;
import com.hzm.aop.service.DemoService;
import com.hzm.aop.service.DemoService2;
import com.hzm.aop.service.impl.DemoService3;
import com.hzm.aop.service.impl.DemoServiceImpl;
import com.hzm.aop.service.impl.DemoServiceImpl2;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年09月13日
 */
public class AnnotationConfigApplicationContextTests {

	private AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

	@Test
	public void serviceTest() {
		final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.registerBean(AspectJServiceConfig.class);
		context.registerBean(DemoServiceImpl.class);
		context.registerBean(DemoServiceImpl2.class);
		context.refresh();

		DemoService bean = context.getBean(DemoService.class);
		bean.a();

	}

	@Test
	public void aopProxyTypeTest() {
		final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.registerBean(AspectJServiceConfig.class);
		context.refresh();

		DemoService2 bean = context.getBean(DemoService2.class);
		bean.a();

	}

	@Test
	public void methodInterceptorTest() {

		context.registerBean(DemoMethodInterceptor.class);
		context.registerBean(InterceptorConfig.class);
		context.registerBean(DemoService3.class);
		context.refresh();

		DemoService3 demoService3 = context.getBean(DemoService3.class);
		demoService3.a();


	}


}
