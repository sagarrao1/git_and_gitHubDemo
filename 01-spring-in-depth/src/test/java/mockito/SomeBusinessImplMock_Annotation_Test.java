package mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessImplMock_Annotation_Test {

	@Mock
	DataService dataServieMock;
	
	@InjectMocks
	SomeBusinessImpl someBusinessImpl;
	
	@Test
	public void testFindGratestofAlldata() {		
		when(dataServieMock.getAllNumbers()).thenReturn(new int[] {24,3,5});		
		assertEquals(24, someBusinessImpl.findGratestofAlldata());		
	}
	
	@Test
	public void testFindGratestofAlldata_withOneNum() {	
		when(dataServieMock.getAllNumbers()).thenReturn(new int[] {17});		
		assertEquals(17, someBusinessImpl.findGratestofAlldata());		
	}
	
	@Test
	public void testFindGratestofAlldata_withNoValue() {	
		when(dataServieMock.getAllNumbers()).thenReturn(new int[] {});		
		assertEquals(Integer.MIN_VALUE, someBusinessImpl.findGratestofAlldata());		
	}

}



