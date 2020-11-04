package com.hzm.aop.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.Arrays;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年11月04日
 */
public class DemoMethodInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {

		System.out.println(getClass().getSimpleName() + " execute before ===========>" + invocation.getMethod().getName() + "方法 ");

		System.out.println("args =========> " + Arrays.toString(invocation.getArguments()));
		System.out.println("StaticPart =========> " + invocation.getStaticPart());
		System.out.println("this =========> " + invocation.getThis());
		System.out.println("class =========> " + invocation.getClass());

		final Object proceed = invocation.proceed();

		System.out.println(getClass().getSimpleName() + " execute after ===========>" + invocation.getMethod().getName() + "方法 ");
		System.out.println(invocation.getMethod().getName() + "方法 return ==========> " + proceed);

		return proceed;
	}
}
