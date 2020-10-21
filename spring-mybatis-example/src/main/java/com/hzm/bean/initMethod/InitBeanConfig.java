package com.hzm.bean.initMethod;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年10月19日
 */
@Component
public class InitBeanConfig {

	@Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
	public DemoBeanInitMethod demoBeanInitMethod() {
		return new DemoBeanInitMethod();
	}

	@Bean
	public DemoInitializingBean demoInitializingBean() {
		return new DemoInitializingBean();
	}

	@Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
	public DemoBeanInitMethodAndBean demoBeanInitMethodAndBean() {
		return new DemoBeanInitMethodAndBean();
	}
}
