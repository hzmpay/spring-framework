package com.hzm.ioc.bean;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年10月28日
 */
@Component
public class PropertiesBean2 {

//	@Value("#{propertiesBean.name}")
	private String name;

	@Resource
	private void setName(PropertiesBean propertiesBean) {
		this.name = propertiesBean.getName();
	}

	public void say() {
		System.out.println(name);
	}
}
