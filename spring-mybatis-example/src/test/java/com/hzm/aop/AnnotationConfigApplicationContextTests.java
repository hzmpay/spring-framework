package com.hzm.aop;

import com.hzm.aop.config.AspectJServiceConfig;
import com.hzm.aop.service.DemoService;
import com.hzm.aop.service.DemoService2;
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


}
