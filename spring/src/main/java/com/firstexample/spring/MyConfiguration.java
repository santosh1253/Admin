package com.firstexample.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages="com.firstexample.spring")
public class MyConfiguration {


    
    @Bean(name="sayHello")
    String getId()
    {
    	return "Hello Hello user";
    }
    
    @Bean(name="sayHello")
    String hello()
    {
    	return "Hello ";
    }

    @Bean
    Address address01()
    {
    	
    	return new Address("2-24","Hyd",123);
    }
    
    @Bean
    @Primary
    Address address02()
    {
    	return new Address("2-34","Vizag",1234);
    }
	

}
