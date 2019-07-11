package com.in28minutes.spring.basics.springin5steps.basics;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.junit.platform.commons.logging.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchIml {
	
	@Autowired
	@Qualifier("quick")
	private SortAlgorithm sortAlgorithm;
	
	//private SortAlgorithm quikSortAlgorithm; we can autowired using the by namme.but the @primary has more priority than the by name and one mor option is @Qualifoer anotations 
	
	// that is the setter injection
/*	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}*/

	// that is the constructor injection
/*	public BinarySearchIml(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}*/
	public int binarySearch (int[] numbers , int numberToSearchFor)
	{
		int[] sortNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);		
	
	return 3;
	}
	
	@PostConstruct
	public void postConstruct() {
		
		System.out.println("the postConsturct====");
	}
	@PreDestroy
	public void preDestroy() {
		
		System.out.println("the preDESTROY======");
	}

}
