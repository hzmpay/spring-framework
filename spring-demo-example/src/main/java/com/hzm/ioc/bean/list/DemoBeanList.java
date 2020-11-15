package com.hzm.ioc.bean.list;

import com.hzm.ioc.bean.DemoBean1;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年10月19日
 */
@Component
public class DemoBeanList {

	@Resource
	private List<DemoBean1> demoBean1List;

	@Bean
	public DemoBean1 demoBean1() {
		return new DemoBean1("demoBean1");
	}

	@Bean
	public DemoBean1 demoBean2() {
		return new DemoBean1("demoBean2");
	}

	@Bean
	public DemoBean1 demoBean3() {
		return new DemoBean1("demoBean3");
	}

	public void say() {
		demoBean1List.forEach(System.out::println);
	}

}
