package com.springframe.Second;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SecondApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SecondApplication.class, args);

		Dev obj = context.getBean(Dev.class);
		obj.build();
	}

}
