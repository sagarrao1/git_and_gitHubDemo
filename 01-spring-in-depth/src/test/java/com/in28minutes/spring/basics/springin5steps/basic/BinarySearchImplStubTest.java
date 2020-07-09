package com.in28minutes.spring.basics.springin5steps.basic;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchImplStubTest {

	@Test
	public void binarySearchGivenNum() {
		BinarySearchImpl binarySearchImpl = new BinarySearchImpl();
		SortAlgorithm sortAlgorithmStub =  new SortAlgorithmStub();;
		binarySearchImpl.setSortAlgorithm(sortAlgorithmStub);
		
		int result = binarySearchImpl.binarySearch(new int[] {12,4,8}, 4);
		assertEquals(3, result);
		
	}

}

class SortAlgorithmStub implements SortAlgorithm{

	@Override
	public int[] sort(int[] numbers) {		
		return numbers;
	}
	
}
