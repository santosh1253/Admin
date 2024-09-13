package com.firstexample.spring;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
//		String res[] = context.getBeanDefinitionNames();
//		System.out.println(Arrays.toString(res));
//		Address a=(Address) context.getBean(Address.class);
//		System.out.println(a);

	}

}
