package com.hzm.ioc;

import com.hzm.aware.MyApplicationContextAware;
import com.hzm.bean.CircularReferenceBean1;
import com.hzm.bean.CircularReferenceBean2;
import com.hzm.bean.DemoBean1;
import com.hzm.bean.circularReference.constructor.BeanA;
import com.hzm.bean.circularReference.constructor.BeanB;
import com.hzm.bean.circularReference.constructor.BeanC;
import com.hzm.bean.circularReference.param.BeanD;
import com.hzm.bean.initMethod.DemoBeanInitMethod;
import com.hzm.bean.initMethod.DemoBeanInitMethodAndBean;
import com.hzm.bean.initMethod.DemoInitializingBean;
import com.hzm.bean.initMethod.InitBeanConfig;
import com.hzm.bean.list.DemoBeanList;
import com.hzm.beanFactoryProcessor.BeanFactoryPostProcessorConfig;
import com.hzm.config.HzmConfig;
import com.hzm.ignore.IgnoreBean1;
import com.hzm.ignore.IgnoreBean2;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年09月13日
 */
public class AnnotationConfigApplicationContextTests {

	@Test
	public void beanDefinitionTest() {
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HzmConfig.class);
//		GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
//		genericBeanDefinition.setLazyInit(false);
		// 注入类型
//		genericBeanDefinition.setAutowireMode(BeanDefinition.);
//		genericBeanDefinition.setScope(BeanDefinition.SCOPE_PROTOTYPE);
//		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

//		final IgnoreBean1 ignoreBean1 = context.getBean(IgnoreBean1.class);
//		System.out.println(ignoreBean1);
	}

	@Test
	public void registerTest() {


		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		System.out.println("==================>register before");

		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		context.register(IgnoreBean1.class);
		context.register(HzmConfig.class);
//		context.registerBean("demo1", IgnoreBean1.class);
//		context.registerBean("demo2", IgnoreBean1.class);
//		context.registerBean("demo3", IgnoreBean1.class);
		System.out.println("==================>register after");
		System.out.println("==================>refresh before");
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

		context.refresh();

		System.out.println("==================>refresh after");
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));



		final IgnoreBean1 ignoreBean1 = context.getBean(IgnoreBean1.class);
		System.out.println(ignoreBean1);

		final IgnoreBean2 ignoreBean2 = context.getBean(IgnoreBean2.class);
		System.out.println(ignoreBean2);


//		final ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();

//		System.out.println(context.getBean("demoBean1"));


	}


	@Test
	public void getBeanTest() {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.registerBean("demoBean1", DemoBean1.class);
		context.registerBean("demoBean2", DemoBean1.class);
		context.registerBean("demoBean3", DemoBean1.class);
		context.refresh();

		context.getBean("demoBean1");
	}

	@Test
	public void circularReferenceBeanTest() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.registerBean(CircularReferenceBean1.class);
		context.registerBean(CircularReferenceBean2.class);
		context.refresh();

		final CircularReferenceBean1 circularReferenceBean1 = (CircularReferenceBean1) context.getBean("circularReferenceBean1");
		System.out.println(circularReferenceBean1);

	}

	@Test
	public void circularReferenceBeanConstructorTest() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.setAllowCircularReferences(false);

		context.registerBean(BeanA.class);
		context.registerBean(BeanB.class);
		context.registerBean(BeanC.class);


		context.refresh();

		System.out.println(context.getBean(BeanA.class));

	}

	@Test
	public void resolvableTypeTest() {
//		ResolvableType.forClass()
	}

	@Test
	public void circularReferenceBeanResourceTest() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.setAllowCircularReferences(false);

		context.scan("com.hzm.bean.circularReference.param");
		context.refresh();

		System.out.println(context.getBean(BeanD.class));

	}

	@Test
	public void registerBeanList() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoBeanList.class);
		final DemoBeanList demoBeanList = context.getBean(DemoBeanList.class);

		demoBeanList.say();

	}

	@Test
	public void applicationContextAwareTest() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.registerBean(MyApplicationContextAware.class);
		context.registerBean(DemoBean1.class);
		context.refresh();

		System.out.println("开始输出===========》");

		System.out.println(MyApplicationContextAware.getBean(DemoBean1.class));
	}

	@Test
	public void initMethodAndInitBeanTest() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(InitBeanConfig.class);
		context.getBean(DemoBeanInitMethod.class);
		context.getBean(DemoInitializingBean.class);
		context.getBean(DemoBeanInitMethodAndBean.class);


		System.out.println("开始销毁容器 ==============》");
		context.close();
	}

	@Test
	public void beanFactoryPostProcessorTest() {
		final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanFactoryPostProcessorConfig.class);


	}


}
