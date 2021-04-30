package com.hzm.webmvc;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2021年04月29日
 */
@HandlesTypes(WebApplicationInitializer.class)
public class MyServletContainerInitializer implements ServletContainerInitializer {

	@Override
	public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
		System.out.println("MyServletContainerInitializer开始执行了 ===============>");
		System.out.println(c);
		System.out.println(ctx);
	}
}
