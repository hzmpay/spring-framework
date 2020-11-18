package com.hzm.httpInvoker.service;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年11月18日
 */
public class HttpInvokerServiceImpl implements HttpInvokerService {

	@Override
	public void say(String msg) {
		System.out.println("HttpInvokerServiceImpl.say()执行了 =========> " + msg);
	}
}
