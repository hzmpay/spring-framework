package com.hzm.propertyEditor;

import java.beans.PropertyEditorSupport;

/**
 * 自定义属性转换器：输入字符串返回Bollean
 *
 * @author Hezeming
 * @version 1.0
 * @date 2021年05月10日
 */
public class CustomBooleanPropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		if (Boolean.TRUE.toString().equals(text)) {
			setValue(Boolean.TRUE);
		} else if (Boolean.FALSE.toString().equals(text)) {
			setValue(Boolean.FALSE);
		} else {
			throw new IllegalArgumentException("param is not vaild!");
		}
	}

	@Override
	public String getAsText() {
		Boolean value = (Boolean) getValue();
		return value == null ? null : value.toString();
	}
}
