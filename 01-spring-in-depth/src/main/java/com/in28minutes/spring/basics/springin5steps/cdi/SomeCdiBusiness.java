package com.in28minutes.spring.basics.springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCdiBusiness {
	
	@Inject
	SomeCdiDAO someCdiDAO;

	public SomeCdiDAO getSomeCdiDAO() {
		return someCdiDAO;
	}

	public void setSomeCdiDAO(SomeCdiDAO someCdiDAO) {
		this.someCdiDAO = someCdiDAO;
	}
	
	public int findGreatestOfNumbers() {
		
		int[] numbers = someCdiDAO.getNumbers();
		int greatest= Integer.MIN_VALUE;
		for (int num : numbers) {
			if(num > greatest) {
				greatest=num;
			}
		}			
		return greatest;		
	}

}
