package com.in28minutes.spring.basics.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class ComponentPersonDAO {
	
	@Autowired
	ComponentJdbcConnection componentJdbcConnection;

	public ComponentJdbcConnection getComponentJdbcConnection() {
		return componentJdbcConnection;
	}

	public void setComponentJdbcConnection(ComponentJdbcConnection componentJdbcConnection) {
		this.componentJdbcConnection = componentJdbcConnection;
	}

	
}