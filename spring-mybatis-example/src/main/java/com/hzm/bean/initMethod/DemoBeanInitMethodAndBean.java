package com.hzm.bean.initMethod;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年10月19日
 */
public class DemoBeanInitMethodAndBean implements InitializingBean {


	public void initMethod() {
		System.out.println("DemoBeanInitMethodAndBean initMethod execute ==========>");
	}

	public void destroyMethod() {
		System.out.println("DemoBeanInitMethodAndBean destroyMethod execute ==========>");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("DemoBeanInitMethodAndBean afterPropertiesSet execute ==========>");
	}
}
