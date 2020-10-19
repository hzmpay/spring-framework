package com.hzm.bean.circularReference.constructor;

import org.springframework.stereotype.Component;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年09月13日
 */
@Component
public class BeanC {

	private BeanA beanA;

	public BeanC(BeanA beanA) {
		System.out.println("beanC has Args Constructor method create =====>");
		this.beanA = beanA;
	}

//	public BeanA getBeanA() {
//		return beanA;
//	}
//
//	public void setBeanA(BeanA BeanA) {
//		this.beanA = BeanA;
//	}
}
