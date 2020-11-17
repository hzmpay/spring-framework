package com.hzm.mvc.controller;

import org.springframework.web.servlet.mvc.LastModified;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年11月17日
 */
public class DemoController implements LastModified {


	@Override
	public long getLastModified(HttpServletRequest request) {
		return 0;
	}
}
