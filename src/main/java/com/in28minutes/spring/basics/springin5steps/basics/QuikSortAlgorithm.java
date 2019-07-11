package com.in28minutes.spring.basics.springin5steps.basics;

import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Qualifier("quick")
public class QuikSortAlgorithm implements SortAlgorithm{
	
	public int[] sort(int[] numbers) {
		
		return numbers;
	}

}
