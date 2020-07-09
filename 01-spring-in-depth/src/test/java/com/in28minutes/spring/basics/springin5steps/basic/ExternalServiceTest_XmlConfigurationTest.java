package com.in28minutes.spring.basics.springin5steps.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.spring.basics.springin5steps.properties.ExternalService;
import com.in28minutes.spring.basics.springin5steps.xml.XmlJdbcConnection;
import com.in28minutes.spring.basics.springin5steps.xml.XmlPersonDAO;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class ExternalServiceTest_XmlConfigurationTest {
	
	@Autowired
	XmlPersonDAO xmlPersonDAO;
	
	@Autowired
	ExternalService externalService;
	
	@Test
	public void testXmlPersonDao() {		
		XmlJdbcConnection jdbcConnection = xmlPersonDAO.getXmlJdbcConnection();
		
		//assertEquals(3, result);		
	}

	@Test
	public void testExternalService() {		
		String actualString = externalService.getUrl();		
		assertEquals("http://someService.com/results/sagarValue", actualString);		
	}

}


