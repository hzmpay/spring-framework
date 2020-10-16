package com.hzm.bean.circularReference;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年09月13日
 */
public class BeanA {

	private BeanB beanB;

//	public BeanA() {
//		System.out.println("beanA has NoArgs Constructor method create =====>");
//	}

	public BeanA(BeanB beanB) {
		System.out.println("beanA has Args Constructor method create =====>");
		this.beanB = beanB;
	}

//	public BeanB getBeanB() {
//		return beanB;
//	}
//
//	public void setBeanB(BeanB beanB) {
//		this.beanB = beanB;
//	}
}
