package com.hzm.aop.config;

import com.hzm.aop.interceptor.DemoMethodInterceptor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年11月04日
 */
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class InterceptorConfig {

	private static final String expression = "execution(* com.hzm.aop.service..*.*(..))";

//	@Bean
//	public DemoMethodInterceptor demoMethodInterceptor() {
//		return new DemoMethodInterceptor();
//	}

	@Bean
	public DefaultPointcutAdvisor defaultPointcutAdvisor2() {
		DemoMethodInterceptor demoMethodInterceptor = new DemoMethodInterceptor();

		AspectJExpressionPointcut aspectJExpressionPointcut = new AspectJExpressionPointcut();
		aspectJExpressionPointcut.setExpression(expression);

		DefaultPointcutAdvisor pointcutAdvisor = new DefaultPointcutAdvisor();
		pointcutAdvisor.setAdvice(demoMethodInterceptor);
		pointcutAdvisor.setPointcut(aspectJExpressionPointcut);
		return pointcutAdvisor;
	}
}
