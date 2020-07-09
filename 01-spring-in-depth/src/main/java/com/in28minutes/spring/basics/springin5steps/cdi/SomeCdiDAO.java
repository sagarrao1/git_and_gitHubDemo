package com.in28minutes.spring.basics.springin5steps.cdi;

import javax.inject.Named;

@Named
public class SomeCdiDAO {
	
	public int[] getNumbers() {
		return new int[] {1,2,94};
	}
}
