package com.in28minutes.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
//@Component
//@Primary  // 1st way
@Qualifier("bubble")  // 2nd way
public class BubbleSortAlgorithm implements SortAlgorithm{
	public int[] sort(int[] numbers) {
		// this will sort array of numbers
		//logic of bubble sort
		return numbers;
	}

}
