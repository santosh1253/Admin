
package com.firstexample.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MyMain {
	
	public static void main(String[] args) {
		var context=new AnnotationConfigApplicationContext(MyConfiguration.class);
//		Address a=context.getBean(Address.class);
//		a.setHno("1-26/A");
//		a.setLocation("Hyderabad");
//		a.setPincode(1254);
//		Student s=context.getBean(Student.class);
//		s.setName("Guru");
//		s.setSid(1);
//		System.out.println(s);
		System.out.println(context.getBean(Address.class));
		
		
		
		
	}

}
