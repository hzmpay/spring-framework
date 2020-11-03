package com.hzm.aop;

import com.hzm.ioc.bean.circularReference.constructor.BeanA;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年10月16日
 */
public class ClassPathXmlApplicationContextTests {

	@Test
	public void circularReferenceBeanConstructorTest() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
//		context.setAllowCircularReferences(false);
		context.setConfigLocation("ioc/getBean.xml");
		context.refresh();
		final BeanA beanA = context.getBean(BeanA.class);
		System.out.println(beanA);
	}

}
