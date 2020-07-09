package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.in28minutes.spring.basics.springin5steps.properties.ExternalService;

@Configuration
@ComponentScan("com.in28minutes.spring.basics.springin5steps.properties")
@PropertySource(value="classpath:app.properties")
//we need to read exertnal.value.service value from app.properties file
public class SpringIn5StepsPropertiesApplication {
	
	private static Logger LOGGER= LoggerFactory.getLogger(SpringIn5StepsPropertiesApplication.class);
	
	public static void main(String[] args) {		
		
		 // new way of adding try catch for application context , if any exception it automatically closes context
		try(AnnotationConfigApplicationContext applicationContext = 
	            new AnnotationConfigApplicationContext(SpringIn5StepsPropertiesApplication.class)){
			
			ExternalService externalService = applicationContext.getBean(ExternalService.class);
		  
			LOGGER.info( " logger info: { }"+externalService);
			LOGGER.info( " logger info2: { } "+externalService.getUrl());		
		  
			 }
		}
}