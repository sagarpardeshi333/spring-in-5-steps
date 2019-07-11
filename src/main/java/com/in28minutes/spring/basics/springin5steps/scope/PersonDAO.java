package com.in28minutes.spring.basics.springin5steps.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class PersonDAO {
	
	@Autowired
	JdbcConnection JdbcConnection;

	public JdbcConnection getJdbcConnection() {
		return JdbcConnection;
	}

	public void setJdbcConnection(JdbcConnection jdbcConnection) {
		JdbcConnection = jdbcConnection;
	}
	

}
