package com.in28minutes.spring.basics.springin5steps.cdi;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusiness_WithMockTest {

	// create mock
	@Mock
	SomeCdiDAO someCdiDaoMock;
	
	//inject it
	@InjectMocks
	SomeCdiBusiness business;	
	
	@Test
	public void testFindGreatestOfNumbers() {
		
		when(someCdiDaoMock.getNumbers()).thenReturn(new int[] {2,112,345,962});		
		int actualResult = business.findGreatestOfNumbers();
		assertEquals(962, actualResult);
	}

	@Test
	public void testFindGreatestWithNoValues() {		
		when(someCdiDaoMock.getNumbers()).thenReturn(new int[] {});		
		int actualResult = business.findGreatestOfNumbers();
		assertEquals(Integer.MIN_VALUE, actualResult);
	}
	
	@Test
	public void testFindGreatestWithEqual() {		
		when(someCdiDaoMock.getNumbers()).thenReturn(new int[] {2,2});		
		int actualResult = business.findGreatestOfNumbers();
		assertEquals(2, actualResult);
	}
}
