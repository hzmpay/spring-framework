package com.hzm.ioc.bean;

import org.springframework.core.ResolvableType;

import java.lang.reflect.ParameterizedType;

/**
 * @author Hezeming
 * @version 1.0
 * @date 2020年10月10日
 */
public class GenericitySon extends GenericityFather<String> {

	public static void main(String[] args) {
		final ResolvableType resolvableType = ResolvableType.forClass(GenericitySon.class);
		final ResolvableType superType = resolvableType.getSuperType();
		System.out.println(superType.getGenerics()[0].resolve());


		ParameterizedType genericSuperclass = (ParameterizedType) GenericitySon.class.getGenericSuperclass();
		System.out.println(genericSuperclass.getActualTypeArguments()[0]);
	}
}
