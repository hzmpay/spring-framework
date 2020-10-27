package com.hzm.ioc.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年10月27日
 */
@Component
public class MyBeanPostProcessor1 implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}
}
