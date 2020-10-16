package com.hzm.bean.circularReference;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年09月13日
 */
public class BeanB {

	private BeanC beanC;

	public BeanB(BeanC beanC) {
		System.out.println("beanB has Args Constructor method create =====>");
		this.beanC = beanC;
	}

//	public BeanC getBeanC() {
//		return beanC;
//	}
//
//	public void setBeanC(BeanC beanC) {
//		this.beanC = beanC;
//	}
}
