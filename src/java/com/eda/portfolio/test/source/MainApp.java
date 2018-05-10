package com.eda.portfolio.test.source;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Gazelle
 */
public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		HelloWorld obj = (HelloWorld) context.getBean(HelloWorld.class);
		obj.getMessage();
	}
}
