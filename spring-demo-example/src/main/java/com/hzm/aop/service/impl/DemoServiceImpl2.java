package com.hzm.aop.service.impl;

import com.hzm.aop.service.DemoService;
import com.hzm.aop.service.DemoService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年11月03日
 */
@Service
public class DemoServiceImpl2 implements DemoService2 {

	@Autowired
	private DemoService demoService;
	@Autowired
	private DemoService3 demoService3;

	@Override
//	@Transactional(propagation = Propagation.REQUIRED)
	public void a() {
//		System.out.println(getClass() + "a执行了===========》" + 1);
//		b();
		System.out.println(demoService.getClass());
		System.out.println(demoService3.getClass());
	}

	@Override
//	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void b() {
//		AopContext.currentProxy().
		System.out.println(getClass() + "b执行了===========》");
	}
}
