package com.hzm.webmvc;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2021年04月29日
 */
public class MyWebApplicationInitializer implements WebApplicationInitializer {


	@Override
	public void onStartup(ServletContext servletContext) {
		System.out.println("MyWebApplicationInitializer开始执行了 ===============>");
//		XmlWebApplicationContext appContext = new XmlWebApplicationContext();
//		appContext.setConfigLocation("/WEB-INF/spring/dispatcher-config.xml");
//
//		ServletRegistration.Dynamic dispatcher =
//				servletContext.addServlet("dispatcher", new DispatcherServlet(appContext));
//		dispatcher.setLoadOnStartup(1);
//		dispatcher.addMapping("/");

		// Load Spring web application configuration
		// 通过注解的方式初始化Spring的上下文
		AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
		// 注册spring的配置类（替代传统项目中xml的configuration）
//		ac.register(AppConfig.class);
		ac.refresh();

		// Create and register the DispatcherServlet
		// 基于java代码的方式初始化DispatcherServlet
		DispatcherServlet servlet = new DispatcherServlet(ac);
		ServletRegistration.Dynamic registration = servletContext.addServlet("app", servlet);
		registration.setLoadOnStartup(1);
		registration.addMapping("/app/*");
	}
}
