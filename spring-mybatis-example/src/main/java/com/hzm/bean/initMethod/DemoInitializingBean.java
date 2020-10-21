package com.hzm.bean.initMethod;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年10月19日
 */
public class DemoInitializingBean implements InitializingBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("DemoInitializingBean afterPropertiesSet execute ==========>");
	}
}
