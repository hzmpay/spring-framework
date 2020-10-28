package com.hzm.aop.aspectJ;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年10月27日
 */
@EnableAspectJAutoProxy
@Aspect
public class AspectJConfig {

	@Pointcut("execution(* com..*.aop..*.*(..))")
	public void point() {

	}

	@Before("point()")
	public void before() {
		System.out.println("point before ==========>");
	}

	@After("point()")
	public void after() {
		System.out.println("point after ==========>");
	}

	@Around("point()")
	public Object around(ProceedingJoinPoint proceedingJoinPoint) {
		System.out.println("point around before ==========>");

		Object object = null;
		try {
			object = proceedingJoinPoint.proceed();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		System.out.println("point around after ==========>");
		return object;

	}

}
