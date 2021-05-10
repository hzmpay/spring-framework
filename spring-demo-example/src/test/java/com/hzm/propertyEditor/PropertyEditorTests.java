package com.hzm.propertyEditor;

import org.junit.jupiter.api.Test;
import org.springframework.beans.propertyeditors.ClassEditor;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.PropertiesEditor;

import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.StringJoiner;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2021年05月10日
 */
public class PropertyEditorTests {

	@Test
	public void classEditorTest() {
		ClassEditor classEditor = new ClassEditor();
		classEditor.setAsText("com.hzm.propertyEditor.PropertyEditorTests");
		System.out.println(classEditor.getValue());
	}

	@Test
	public void customDateEditorTest() {
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-mm-dd"), true);
		editor.setAsText("2021-05-10");
		System.out.println(editor.getValue().getClass());
	}

	@Test
	public void propertiesEditorTest() {
		PropertiesEditor editor = new PropertiesEditor();
		// \r\n为分隔符
		StringJoiner joiner = new StringJoiner("\r\n");
		editor.setAsText(joiner.add("name=Jeremy").add("age=18").toString());
//		editor.setAsText("name=Jeremy&age=18");
		Properties properties = (Properties) editor.getValue();
		System.out.println(properties.getProperty("name"));
		System.out.println(properties.getProperty("age"));
		System.out.println(properties);
	}

	@Test
	public void customBooleanPropertyEditorTest() {
		CustomBooleanPropertyEditor editor = new CustomBooleanPropertyEditor();
		editor.setAsText("true");
		System.out.println(editor.getValue().getClass());
		System.out.println(editor.getValue());

		editor.setAsText("true1");
		System.out.println(editor.getValue().getClass());
	}

}
