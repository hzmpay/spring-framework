package com.hzm.beanWrapper;

import com.hzm.propertyEditor.CustomBooleanPropertyEditor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.propertyeditors.CustomDateEditor;

import java.beans.PropertyEditor;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2021年05月10日
 */
public class BeanWrapperTests {

	/**
	 * BeanWrapper设置属性的用法
	 *
	 * @param
	 * @return void
	 * @author Hezeming
	 */
	@Test
	public void propertiesTest() {
		BeanWrapperDemoBean beanWrapperDemoBean = new BeanWrapperDemoBean();
		// 利用BeanWrapper进行属性的编辑
		BeanWrapper beanWrapper = new BeanWrapperImpl(beanWrapperDemoBean);

		System.out.println(beanWrapper.getWrappedInstance());

		beanWrapper.setPropertyValue("name", "test");
		System.out.println(beanWrapper.getWrappedInstance());

		PropertyValue propertyValue = new PropertyValue("age", 18);
		beanWrapper.setPropertyValue(propertyValue);
		System.out.println(beanWrapper.getWrappedInstance());

		beanWrapper.setPropertyValue("map", new HashMap());
		// []是设置map中的属性
		beanWrapper.setPropertyValue("map[name]", "map的名字");
		System.out.println(beanWrapper.getWrappedInstance());
		System.out.println(beanWrapper.getPropertyValue("map[name]"));
		System.out.println(beanWrapper.getPropertyValue("map[age]"));

		BeanWrapperDemoBeanSub sub = new BeanWrapperDemoBeanSub();
		beanWrapper.setPropertyValue("sub", sub);
		beanWrapper.setPropertyValue("sub.name", "儿子");
		System.out.println(beanWrapper.getWrappedInstance());

	}

	/**
	 * propertyEditor在BeanWrapper中的用法
	 *
	 * @param
	 * @return void
	 * @author Hezeming
	 */
	@Test
	public void propertyEditorTest() {
		BeanWrapperDemoBean beanWrapperDemoBean = new BeanWrapperDemoBean();
		// 利用BeanWrapper进行属性的编辑
		BeanWrapper beanWrapper = new BeanWrapperImpl(beanWrapperDemoBean);

		BeanWrapperDemoBeanSub sub = new BeanWrapperDemoBeanSub();
		beanWrapper.setPropertyValue("sub", sub);

		// 日期属性编辑器
		PropertyEditor propertyEditor = new CustomDateEditor(new SimpleDateFormat("yyyy-mm-dd"), true);
		beanWrapper.registerCustomEditor(Date.class, propertyEditor);
		beanWrapper.setPropertyValue("sub.createTime", "2021-05-10");
		System.out.println(beanWrapper.getWrappedInstance());

		// 自定义属性编辑器
		CustomBooleanPropertyEditor editor = new CustomBooleanPropertyEditor();
		beanWrapper.registerCustomEditor(Boolean.class, editor);
		beanWrapper.setPropertyValue("man", "true");
		System.out.println(beanWrapper.getWrappedInstance());
	}
}
