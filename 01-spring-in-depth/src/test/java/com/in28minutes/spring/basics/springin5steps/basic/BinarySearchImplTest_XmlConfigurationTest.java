package com.in28minutes.spring.basics.springin5steps.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//@ContextConfiguration(locations = "/applicationContext.xml")
@ContextConfiguration(locations = "/testContext.xml")
public class BinarySearchImplTest_XmlConfigurationTest {
	@Autowired
	BinarySearchImpl binarySearchImpl;
	
	@Test
	public void binarySearchGivenNum() {
		
		int result = binarySearchImpl.binarySearch(new int[] {12,4,8}, 4);
		assertEquals(3, result);
		
	}

}


