package com.hzm.ioc.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年10月23日
 */
@Component
public class MyInstantiationAwareBeanPostProcessor2 implements InstantiationAwareBeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(getClass() + "====>postProcessBeforeInitialization: bean = " + bean + "beanName = " + beanName);
		return null;
	}
}
