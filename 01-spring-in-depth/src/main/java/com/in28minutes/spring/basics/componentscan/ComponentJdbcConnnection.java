package com.in28minutes.spring.basics.componentscan;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ComponentJdbcConnnection {
	
	public ComponentJdbcConnnection(){
//		System.out.println(" construtor of ComponentJdbcConnnection ");
	}

	public int methodInJdbcConnection() {
		System.out.println("methodInJdbcConnection");
		return 5;
	}
}
