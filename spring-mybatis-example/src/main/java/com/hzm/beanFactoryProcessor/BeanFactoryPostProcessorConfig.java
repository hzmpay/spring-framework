package com.hzm.beanFactoryProcessor;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年10月21日
 */
@Configuration
@ComponentScan(value = {"com.hzm.beanFactoryProcessor"})
public class BeanFactoryPostProcessorConfig {
}
