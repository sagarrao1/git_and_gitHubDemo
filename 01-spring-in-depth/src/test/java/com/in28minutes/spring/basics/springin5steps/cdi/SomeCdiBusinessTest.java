package com.in28minutes.spring.basics.springin5steps.cdi;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.spring.basics.springin5steps.SpringIn5StepsBasicApplication;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringIn5StepsBasicApplication.class)
public class SomeCdiBusinessTest {

	@Autowired
	SomeCdiBusiness business;	
	
	@Test
	public void testFindGreatestOfNumbers() {
		int actualResult = business.findGreatestOfNumbers();
		assertEquals(94, actualResult);
	}

}
