package hzm;

import hzm.config.HzmConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年09月13日
 */
public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HzmConfig.class);
//		GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
//		genericBeanDefinition.setLazyInit(false);
		// 注入类型
//		genericBeanDefinition.setAutowireMode(BeanDefinition.);
//		genericBeanDefinition.setScope(BeanDefinition.SCOPE_PROTOTYPE);
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));



	}
}
