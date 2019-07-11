package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.springin5steps.basics.BinarySearchIml;

@Configuration
@ComponentScan
// if we want convert spring boot application into spring then remove the spring boot dependency and add spring-core 
// and spring context and  add AnnotationConfigApplicationContext in main class 
//(ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class);)
//Instead of the @springBootApplication annotantion use @Configuratuon and @coponentScan
//<dependency>
//<groupId>org.springframework boot</groupId>
//<artifactId>spring-boot-starter</artifactId>
// </dependency>
public class SpringIn5StepsBasicApplication {

	public static void main(String[] args) {
		 //= new BinarySearchIml(new BubbleSortAlgorithm());
		//BinarySearchIml binarySearchIml = new BinarySearchIml(new QuikSortAlgorithm());
		
		// we are using the try block this feeature came in java 7
		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class)){
		BinarySearchIml binarySearch = applicationContext.getBean(BinarySearchIml.class);
		BinarySearchIml binarySearch1 = applicationContext.getBean(BinarySearchIml.class);
		
	System.out.println("the binarySearch instance===="+binarySearch);
	System.out.println("the binarySearch1 instance==="+binarySearch1);
	// the binarySearch instance====com.in28minutes.spring.basics.springin5steps.BinarySearchIml@4e31276e
	//the binarySearch1 instance===com.in28minutes.spring.basics.springin5steps.BinarySearchIml@4e31276e
	//both instances always return same hashcode because at secomd time spring provide the copy of that instance not creating other bean thats called as SINGLETON
	// If you want different instances then you have use @SCOPE annotantion and defied inside @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) then only you will get the different instance f that class 
		
		int result = binarySearch.binarySearch(new int[] {1, 12,12},3);
		 System.out.println("the resiu;t is the====="+result);
	//	SpringApplication.run(SpringIn5StepsApplication.class, args);
		}
		// applicationContext.close();// we can also close using the try block this 
		 
	}
	
}
