package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.in28minutes.spring.basics.springin5steps.basics.BinarySearchIml;
import com.in28minutes.spring.basics.springin5steps.properties.SomeExternalSevice;

@Configuration
@ComponentScan
// we have to  load app.properties here
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {

	public static void main(String[] args) {
/**************************HERE WE ARE SHOWING THE CODE FOR HOW TO GET VALUES FROM PROPERTY FILE*****************
* here we are using the @@PropertySource("classpath:app.properties") annotation to loadd the property file 
 * we are injeting value of the variable using the @value annotation
 * @Value("${external.service.url}")
 * String Url
 * 
 * here we are injkected the value of the external service url value into Url String varibale
 * 
 * */		
		
		
		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsPropertiesApplication.class)){
		
			SomeExternalSevice someExternalSevice = applicationContext.getBean(SomeExternalSevice.class);
			System.out.println("the url from properties file is thee====="+someExternalSevice.retuernServiceUrl());
		} 
		 
	}
	
}
