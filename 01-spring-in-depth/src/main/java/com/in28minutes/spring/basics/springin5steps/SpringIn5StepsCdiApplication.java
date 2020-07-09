package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.springin5steps.cdi.SomeCdiBusiness;


@Configuration
@ComponentScan("com.in28minutes.spring.basics.springin5steps.cdi")
public class SpringIn5StepsCdiApplication {
	
	private static Logger LOGGER=LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsCdiApplication.class);	
		
		SomeCdiBusiness someCdiBusiness = applicationContext.getBean(SomeCdiBusiness.class);
	
//		System.out.println(someCdiBusiness);
//		System.out.println(someCdiBusiness.getSomeCdiDAO());
		
		LOGGER.info("{}",someCdiBusiness);
		LOGGER.info("{}",someCdiBusiness.getSomeCdiDAO());	
		
		
	}

}

