package com.hzm.rmi;

import com.hzm.BaseTest;
import com.hzm.rmi.client.RmiClientConfig;
import com.hzm.rmi.client.RmiService;
import com.hzm.rmi.service.RmiServiceConfig;
import org.junit.jupiter.api.Test;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年09月13日
 */
public class AnnotationConfigApplicationContextTests extends BaseTest {



	@Test
	public void serviceTest() throws InterruptedException {
		context.register(RmiServiceConfig.class);
		context.refresh();
		System.out.println("服务端启动完毕");
		Thread.sleep(1000 * 1000);
	}

	@Test
	public void clientTest() {
		context.register(RmiClientConfig.class);
		context.refresh();
		System.out.println("客户端启动完毕");
		RmiService rmiService = context.getBean(RmiService.class);
		rmiService.say();
		System.out.println("执行完毕");
	}

}
