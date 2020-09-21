package hzm.config;

import hzm.bean.DemoBean2;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年09月16日
 */
@Component
public class BeanFactoryPostProcessorImpl implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println(getClass() + " execute!");


		GenericBeanDefinition demoBean1Definition = (GenericBeanDefinition) beanFactory.getBeanDefinition("demoBean1");
		demoBean1Definition.setBeanClass(DemoBean2.class);
	}
}
