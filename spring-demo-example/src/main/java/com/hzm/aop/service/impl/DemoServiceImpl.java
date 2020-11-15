package com.hzm.aop.service.impl;

import com.hzm.aop.service.DemoService;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Service;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年11月03日
 */
@Service
public class DemoServiceImpl implements DemoService {

	@Override
//	@Transactional(propagation = Propagation.REQUIRED)
	public void a() {
		System.out.println(getClass() + "a执行了===========》");
		System.out.println("《============== a分割线 ==============》");
		b();
		System.out.println("《============== b分割线 ==============》");
		((DemoService) AopContext.currentProxy()).b();
	}

	@Override
//	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void b() {
//		AopContext.currentProxy().
		System.out.println(getClass() + "b执行了===========》");
	}
}
