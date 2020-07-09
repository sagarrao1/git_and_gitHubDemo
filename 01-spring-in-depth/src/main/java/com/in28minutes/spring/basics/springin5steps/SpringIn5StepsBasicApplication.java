package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;

//@SpringBootApplication   // in order to use it, in pom.xml uncomment boot dependencies  
@Configuration
@ComponentScan("com.in28minutes.spring.basics.springin5steps")
public class SpringIn5StepsBasicApplication {
		
	private static Logger LOGGER =  LoggerFactory.getLogger(SpringIn5StepsBasicApplication.class);

//	@SuppressWarnings("resource")
	public static void main(String[] args) {		
		int[] nums= {12,4,6};		
//		BinarySearchImpl binarySearch= new BinarySearchImpl(new QuickSortAlgorithm());		
		
//		Below configuration is for spring boot application
//		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
		
		//Spring normal configuration
		try( // new way of adding try catch for application context , if any exception it automatically closes context
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class)) {				
						
		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);	
		BinarySearchImpl binarySearchImpl1 = applicationContext.getBean(BinarySearchImpl.class);	
		System.out.println("bean 1: "+binarySearchImpl);
		System.out.println("bean 2: "+binarySearchImpl1);
		
		int result = binarySearchImpl.binarySearch(nums, 3);
//		
//		com.in28minutes.spring.basics.springin5steps.BubbleSortAlgorithm@15db9742
//		System.out.println("Result: "+result);
		
		LOGGER.info( " logger info: { }"+binarySearchImpl);
		LOGGER.info( " logger info2: { } "+binarySearchImpl.binarySearch(nums, 6)+" close result");
		
//		applicationContext.close();
		}
	}

}
