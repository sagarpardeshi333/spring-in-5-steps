package com.in28minutes.spring.basics.springin5steps;

import org.junit.platform.commons.logging.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.springin5steps.scope.PersonDAO;


@SpringBootApplication
public class SpringIn5StepsScopeApplication {

	//private static Logger LOGGER = (Logger) LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);
	public static void main(String[] args) {
		
		//ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsScopeApplication.class);
	
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);
		
		
		/****************** WRITE HERE YOUR ***************************************************
		 * 
		 * We will get diff instance of the JDBC when we have define SCOPE prototype for both personDAO 
		 * and JdbcConnection and if you want diff insatnce for JdbcCOnnection with bydefault scope of 
		 * the PesomDao(In this case you will get the same instance of JdbcConnection with scope is prototype) 
		 * you have to mentioned the scope prototype and proxymode with target class
		 *
		 ***************************************************************************************/
		
		System.out.println("the first dao==="+personDAO);
		System.out.println("the first JDBC==="+personDAO.getJdbcConnection());// we will get diff instance of the JDBC when we have define SCOPE prototype for both personDAO and JdbcConnection and if you want diff insatnce for JdbcCOnnection with bydefault scope of the PesomDao(In this case you will get the same instance of JdbcConnection with scope is prototype) you have to mentioned the scope prototype and proxymode with target class
		System.out.println("the SECOND dao==="+personDAO2);
		System.out.println("the SECOND JDNC==="+personDAO2.getJdbcConnection());
		
//		LOGGER.info("{}",personDAO);
//		LOGGER.info("{}",personDAO.getJdbcConnection());
//		LOGGER.info("{}",personDAO2);
//		LOGGER.info("{}",personDAO2.getJdbcConnection());

	}

}
