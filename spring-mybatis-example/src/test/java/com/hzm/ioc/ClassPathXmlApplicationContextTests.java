package com.hzm.ioc;

import com.hzm.bean.circularReference.constructor.BeanA;
import com.hzm.propertieConfig.DemoPerson;
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

	@Test
	public void propertyPlaceholderConfigurerTest() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("PropertyPlaceholderConfigurer.xml");
		final DemoPerson bean = context.getBean(DemoPerson.class);
		System.out.println(bean);
	}

	@Test
	public void beanFactoryPostProcessorTest() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("PropertyPlaceholderConfigurer.xml");
	}

}
