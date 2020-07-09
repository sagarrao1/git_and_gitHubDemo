package com.in28minutes.spring.basics.springin5steps.scope;

import org.springframework.stereotype.Component;

/*When dependency is using prototype but bean using that dependency is singleton. 
 * It makes dependency also Singleton, to use dependency as prototype 
 * we need to use proxy */

@Component
//@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, 
//              proxyMode = ScopedProxyMode.TARGET_CLASS)
public class JdbcConnection {
	
	public JdbcConnection(){
		System.out.println(" construtor of jdbc connection");
	}

}
