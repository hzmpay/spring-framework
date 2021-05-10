package com.hzm.beanWrapper;

import java.util.Date;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2021年05月10日
 */
public class BeanWrapperDemoBeanSub {

	private String name;

	private int age;

	private Date createTime;

	private String createTimeStr;

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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateTimeStr() {
		return createTimeStr;
	}

	public void setCreateTimeStr(String createTimeStr) {
		this.createTimeStr = createTimeStr;
	}

	@Override
	public String toString() {
		return "BeanWrapperDemoBeanSub{" +
				"name='" + name + '\'' +
				", age=" + age +
				", createTime=" + createTime +
				", createTimeStr='" + createTimeStr + '\'' +
				'}';
	}
}
