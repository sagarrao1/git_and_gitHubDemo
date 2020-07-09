package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.spring.basics.springin5steps.properties.ExternalXmlService;
import com.in28minutes.spring.basics.springin5steps.xml.XmlPersonDAO;
	   
public class SpringIn5StepsXmlApplication {
	
	private static Logger LOGGER=LoggerFactory.getLogger(SpringIn5StepsXmlApplication.class);

	public static void main(String[] args) {
		
//		AnnotationConfigApplicationContext applicationContext =				
//		new AnnotationConfigApplicationContext(SpringIn5StepsXmlApplication.class);

	
		try(ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml")) {
		
		LOGGER.info("beans loaded -> {}", (Object) applicationContext.getBeanDefinitionNames());
		LOGGER.info("beans count -> {}", applicationContext.getBeanDefinitionCount());
		
//		Old way
//		XmlPersonDAO xmlPersonDAO = (XmlPersonDAO) applicationContext.getBean("XmlPersonDAO"); 		
		
		XmlPersonDAO xmlPersonDAO = (XmlPersonDAO) applicationContext.getBean(XmlPersonDAO.class);
		LOGGER.info("info {}", xmlPersonDAO );
		LOGGER.info("info 2{}", xmlPersonDAO.getXmlJdbcConnection());
		
		ExternalXmlService externalXmlService = applicationContext.getBean(ExternalXmlService.class);	
		LOGGER.info("info 3 {}", externalXmlService );
		LOGGER.info("info 4 {}", externalXmlService.getUrl() );
		
//		applicationContext.close(); don't need as we are using new java 8 version of try() method
		}
	}
	
}
