package com.in28minutes.spring.basics.springin5steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
//@Scope("prototype")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
	
  private Logger logger = LoggerFactory.getLogger(BinarySearchImpl.class);

	@Autowired	
	@Qualifier("quick")
	private SortAlgorithm sortAlgorithm;
  
//	via constructor injecttion .there 2 types we can inject, 1. via constrcutor 2. setter
//	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//		super();
//		this.sortAlgorithm = sortAlgorithm;
//	}
	
	public int binarySearch(int[] numbers, int numberTosearchFor) {		
		//Implementing sorting logic sort array
		//BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		//search array
		
		//Return the result		
		return 3;
	}
	
//	Setters and getters
	
//	@Autowired	
//	@Qualifier("quick")	
	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}
	
	public SortAlgorithm getSortAlgorithm() {
		return sortAlgorithm;
	}
	
	
	@PostConstruct
	public void postcostruct(){
	 logger.info("postconstruct");
	}

	@PreDestroy
	public void preDestroy(){
		logger.info("pre Destroy");
	}

}
