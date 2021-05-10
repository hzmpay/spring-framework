package com.hzm.beanWrapper;

import java.util.Map;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2021年05月10日
 */
public class BeanWrapperDemoBean {

	private String name;

	private int age;

	private BeanWrapperDemoBeanSub sub;

	private Map<String, Object> map;

	private Boolean man;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public BeanWrapperDemoBeanSub getSub() {
		return sub;
	}

	public void setSub(BeanWrapperDemoBeanSub sub) {
		this.sub = sub;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public Boolean getMan() {
		return man;
	}

	public void setMan(Boolean man) {
		this.man = man;
	}

	@Override
	public String toString() {
		return "BeanWrapperDemoBean{" +
				"name='" + name + '\'' +
				", age=" + age +
				", sub=" + sub +
				", map=" + map +
				", man=" + man +
				'}';
	}
}
