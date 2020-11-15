package com.hzm.message;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.MessageFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年10月26日
 */
public class MessageTest {

	@Test
	public void localeTest() {
		final Locale locale = new Locale("zh", "CN");

		final Locale china = Locale.CHINA;

		final Locale localeDefault = Locale.getDefault();

	}

	@Test
	public void messageFormatTest() {
		String pattern = "第0位：{0} ，第1位：{1}，第2位：{2}";

		Object[] param = {"hzm", new GregorianCalendar().getTime(), 1.0E3};

		final String format = MessageFormat.format(pattern, param);
		System.out.println(format);

	}

	@Test
	public void messageSourceTest() {
		final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ioc/ResourceBundleMessageSource.xml");


		final String test1 = context.getMessage("test", null, Locale.CHINA);
		final String test2 = context.getMessage("test", null, Locale.US);
		System.out.println(test1);
		System.out.println(test2);

//		Object[] param = {"Jeremy", new GregorianCalendar().getTime()};
//		final String msg1 = context.getMessage("test", param, Locale.CHINA);
//		final String msg2 = context.getMessage("test", param, Locale.US);
//
//		System.out.println(msg1);
//		System.out.println(msg2);
	}
}
