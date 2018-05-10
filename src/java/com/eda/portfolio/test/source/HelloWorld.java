package com.eda.portfolio.test.source;

import javax.inject.Named;
import org.springframework.stereotype.Component;

@Component
@Named("HelloWorld")
public class HelloWorld {

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message);
		throw new NullPointerException("TG");	
	}
}
