package com.hzm.aop.config;

import com.hzm.aop.interceptor.DemoMethodInterceptor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年11月04日
 */
@Configuration
public class InterceptorConfig {

	private static final String expression = "execution(* com.hzm.aop.service..*(..))";

	@Bean
	public DefaultPointcutAdvisor defaultPointcutAdvisor2(DemoMethodInterceptor demoMethodInterceptor) {
		DefaultPointcutAdvisor pointcutAdvisor = new DefaultPointcutAdvisor();
		AspectJExpressionPointcut aspectJExpressionPointcut = new AspectJExpressionPointcut();

		aspectJExpressionPointcut.setExpression(expression);

		pointcutAdvisor.setPointcut(aspectJExpressionPointcut);
		pointcutAdvisor.setAdvice(demoMethodInterceptor);
		return pointcutAdvisor;
	}
}
