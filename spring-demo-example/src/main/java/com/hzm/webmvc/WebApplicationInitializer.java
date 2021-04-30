package com.hzm.webmvc;

import javax.servlet.ServletContext;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2021年04月29日
 */
public interface WebApplicationInitializer {

	void onStartup(ServletContext servletContext);
}
