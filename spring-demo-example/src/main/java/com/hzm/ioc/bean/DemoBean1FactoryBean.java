package com.hzm.ioc.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年09月24日
 */
public class DemoBean1FactoryBean implements FactoryBean<DemoBean1> {
	@Override
	public DemoBean1 getObject() throws Exception {
		return new DemoBean1("factoryCreateBean");
	}

	@Override
	public Class<?> getObjectType() {
		return DemoBean1.class;
	}
}
