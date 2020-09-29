package com.hzm;

import com.hzm.config.HzmConfig;
import com.hzm.ignore.IgnoreBean1;
import com.hzm.ignore.IgnoreBean2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年09月13日
 */
public class AnnotationConfigApplicationContextTest {

	public static void main(String[] args) {


		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HzmConfig.class);
//		GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
//		genericBeanDefinition.setLazyInit(false);
		// 注入类型
//		genericBeanDefinition.setAutowireMode(BeanDefinition.);
//		genericBeanDefinition.setScope(BeanDefinition.SCOPE_PROTOTYPE);
//		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

//		final IgnoreBean1 ignoreBean1 = context.getBean(IgnoreBean1.class);
//		System.out.println(ignoreBean1);

		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		context.register(IgnoreBean1.class);
		System.out.println("==================>register over");
		System.out.println("==================>refresh before");
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		context.refresh();
		System.out.println("==================>refresh after");
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));


		final IgnoreBean1 ignoreBean2 = context.getBean(IgnoreBean1.class);
		System.out.println(ignoreBean2);

		final IgnoreBean2 ignoreBean3 = context.getBean(IgnoreBean2.class);
		System.out.println(ignoreBean3);


//		final ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();

//		System.out.println(context.getBean("demoBean1"));


	}
}
