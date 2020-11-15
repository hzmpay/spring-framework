package com.hzm.ioc.bean.circularReference.param;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年09月13日
 */
@Component
public class BeanF {

	@Resource
	private BeanD beanD;

}
