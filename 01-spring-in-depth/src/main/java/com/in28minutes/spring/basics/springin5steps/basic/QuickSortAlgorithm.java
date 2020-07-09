package com.in28minutes.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("quick") 
// will not work via constructor injection only works with setter injection 
public class QuickSortAlgorithm implements SortAlgorithm{
	
	public int[] sort(int[] numbers) {
		// this will sort array of numbers
		//logic of quick sort
		return numbers;
	}
}
