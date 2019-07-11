package com.in28minutes.spring.basics.springin5steps.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class SomeExternalSevice {
	
	@Value("${external.service.url}")
	private String url;
	
	public String retuernServiceUrl() {
		
		return url;
	} 
}
