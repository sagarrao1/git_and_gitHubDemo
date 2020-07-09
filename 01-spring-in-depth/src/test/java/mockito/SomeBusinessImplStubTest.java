package mockito;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeBusinessImplStubTest {

	@Test
	public void testFindGratestofAlldata() {
		SomeBusinessImpl someBusinessImpl= new SomeBusinessImpl(new DataServiceStub());
		int result = someBusinessImpl.findGratestofAlldata();		
		System.out.println("result : "+result);
		
		assertEquals(5, result);
		
	}
}

class DataServiceStub implements DataService{

	@Override
	public int[] getAllNumbers() {
		// TODO Auto-generated method stub
		return new int[] {2, 3, 5};
	}
	
}

