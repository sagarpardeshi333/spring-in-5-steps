package com.in28minutes.spring.basics.springin5steps;

import org.junit.platform.commons.logging.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.spring.basics.springin5steps.basics.BinarySearchIml;
import com.in28minutes.spring.basics.springin5steps.scope.PersonDAO;
import com.in28minutes.spring.basics.springin5steps.xml.XmlPersonDAO;

public class SpringIn5StepsXmlContextApplication {

	//private static Logger LOGGER = (Logger) LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);
	public static void main(String[] args) {
		 //= new BinarySearchIml(new BubbleSortAlgorithm());
		//BinarySearchIml binarySearchIml = new BinarySearchIml(new QuikSortAlgorithm());
		
		// we are using the try block this feeature came in java 7
		try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")){
	//applicationContext.xml
			
			System.out.println("how many beans inside the applicationContext===="+applicationContext.getBeanDefinitionCount());
		XmlPersonDAO xmlPersonDAO = applicationContext.getBean(XmlPersonDAO.class);
		System.out.println("the XMLPERSONDAO======"+xmlPersonDAO);
		System.out.println("the JDBCCOMECCTION======"+xmlPersonDAO.getXmlJdbcConnection());
		
	
		}
		// applicationContext.close();// we can also close using the try block this 
		 
	}
	
}