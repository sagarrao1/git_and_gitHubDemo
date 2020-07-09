package com.in28minutes.spring.basics.springin5steps.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.spring.basics.springin5steps.SpringIn5StepsBasicApplication;

//Load the context
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringIn5StepsBasicApplication.class)
public class BinarySearchImplTest_Step5BasicApplicationTest {
	
//     Get bean from context
	@Autowired
	BinarySearchImpl binarySearchImpl;
	
	@Test
	public void testbinarySearchGivenNum() {
//		check method on binarySearchImpl
//		check if the value is correct or not
		int result = binarySearchImpl.binarySearch(new int[] {2,12,3},3);
		assertEquals(3, result);
	}

}
