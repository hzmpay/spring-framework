package com.hzm.ioc;

import com.hzm.bean.circularReference.constructor.BeanA;
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
		context.setConfigLocation("application-context.xml");
		context.refresh();
		final BeanA beanA = context.getBean(BeanA.class);
		System.out.println(beanA);
	}

}
