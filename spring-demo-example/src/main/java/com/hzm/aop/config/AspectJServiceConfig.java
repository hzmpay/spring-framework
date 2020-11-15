package com.hzm.aop.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年10月27日
 */
@Configuration
@EnableAspectJAutoProxy(exposeProxy = true, proxyTargetClass = true)
@Aspect
@ComponentScan("com.hzm.aop.service")
@Order(1)
public class AspectJServiceConfig {

	@Pointcut("execution(* com.hzm.aop.service..*(..))")
	public void point() {

	}

	@Before("point()")
	public void before(JoinPoint proceedingJoinPoint) {
		System.out.println("point before ==========>" + proceedingJoinPoint);
	}

	@After("point()")
	public void after(JoinPoint proceedingJoinPoint) {
		System.out.println("point after ==========>" + proceedingJoinPoint);
	}

//	@Around("point()")
	public Object around(ProceedingJoinPoint proceedingJoinPoint) {
		System.out.println("point around before ==========>" + proceedingJoinPoint);

		Object object = null;
		try {
			object = proceedingJoinPoint.proceed();
//			int i = 1/0;
		} catch (Throwable throwable) {
			System.out.println("发生异常：" + throwable.getMessage());
		}
		System.out.println("point around after ==========>" + proceedingJoinPoint);
		return object;

	}

//	@AfterReturning("point()")
	public void afterReturning(JoinPoint proceedingJoinPoint) {
		System.out.println("point afterReturning ==========>" + proceedingJoinPoint);
	}

//	@AfterThrowing(pointcut = "point()", throwing = "e")
	public void afterThrowing(JoinPoint proceedingJoinPoint, Exception e) {
		System.out.println("point afterThrowing ==========>" + proceedingJoinPoint + " 异常为： " + e.getMessage());
	}

}
