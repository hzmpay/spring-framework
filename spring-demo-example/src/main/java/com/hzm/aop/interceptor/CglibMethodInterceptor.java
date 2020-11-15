package com.hzm.aop.interceptor;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年11月05日
 */
public class CglibMethodInterceptor implements MethodInterceptor {

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		System.out.println("Before invoke " + method);
		Object invoke = methodProxy.invokeSuper(obj, args);
		System.out.println("After invoke " + method);
		return invoke;
	}
}
