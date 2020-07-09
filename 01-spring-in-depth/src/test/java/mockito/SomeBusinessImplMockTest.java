package mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SomeBusinessImplMockTest {
	
	DataService dataServieMock;
	
	@Before
	public void setup() {
		dataServieMock = mock(DataService.class);
	}
	
	@After
	public void teardown() {
		dataServieMock 	= null;
	}
	
	@Test
	public void testFindGratestofAlldata() {		
		when(dataServieMock.getAllNumbers()).thenReturn(new int[] {24,3,5});		
		SomeBusinessImpl someBusinessImpl= new SomeBusinessImpl(dataServieMock);
		int result = someBusinessImpl.findGratestofAlldata();		
		assertEquals(24, result);
		
	}
	
	@Test
	public void testFindGratestofAlldata_withOneNum() {	
		when(dataServieMock.getAllNumbers()).thenReturn(new int[] {17});		
		SomeBusinessImpl someBusinessImpl= new SomeBusinessImpl(dataServieMock);
		int result = someBusinessImpl.findGratestofAlldata();		
		assertEquals(17, result);
		
	}
}



