package com.hzm.aop;

import com.hzm.aop.config.AspectJConfig;
import com.hzm.aop.bean.AspectJBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年10月27日
 */
public class AspectJTest {

	@Test
	public void aspectJXmlTest() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop/AspectJTest.xml");

		final AspectJBean bean = context.getBean(AspectJBean.class);
		bean.say();
	}

	@Test
	public void aspectJAnnotationTest() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.registerBean(AspectJConfig.class);
		context.registerBean(AspectJBean.class);
		context.refresh();

		final AspectJBean bean = context.getBean(AspectJBean.class);
		bean.say();
	}
}
