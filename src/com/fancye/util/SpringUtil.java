package com.fancye.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringUtil {

	public static Object getBean(String beanID){
		ApplicationContext context = new ClassPathXmlApplicationContext("/spring/spring-jms.xml");
		
		return context.getBean(beanID);
	}
}
