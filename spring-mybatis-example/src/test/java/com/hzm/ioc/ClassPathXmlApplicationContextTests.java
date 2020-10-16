package com.hzm.ioc;

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
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		context.refresh();
	}

}
