package com.in28minutes.spring.basics.springin5steps;

import org.junit.platform.commons.logging.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.component.ComponentPersonDAO;
import com.in28minutes.spring.basics.springin5steps.scope.PersonDAO;


//@Configuration
//@ComponentScan("com.in28minutes")
@SpringBootApplication
@ComponentScan("com.in28minutes.spring.basics.component")
public class SpringIn5StepsComponentApplication {

	public static void main(String[] args) {
		
		 
		//ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsScopeApplication.class);
		 ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsComponentApplication.class, args);
		ComponentPersonDAO componentPersonDAO = applicationContext.getBean(ComponentPersonDAO.class);
		/**********
		 */
		// GOT ERROR: Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.in28minutes.spring.basics.component.ComponentPersonDAO' available
		// REASON :here we got error becausse we definr the componetDao classes in other pacakage and sprimnf @componentScan finding the beans in the same package ()
		// we have to handle this errror so we need to write component scan with package name that containsthe commpemnnet classes just below the @springBootApplication annotantion
		
		System.out.println("the component dao is the==="+componentPersonDAO);
		
		
		

	}

}
