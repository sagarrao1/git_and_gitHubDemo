package com.in28minutes.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {

//	List<String> list = new LinkedList<>();
//	Map<Integer,String> map= new TreeMap<Integer, String>();
	
	@Autowired
	ComponentJdbcConnnection jdbcConnection;

	public ComponentJdbcConnnection getJdbcConnection() {
		System.out.println("getJdbcConnection of ComponentJdbcConnnection method");
		int methodInJdbcConnection = jdbcConnection.methodInJdbcConnection();
		return jdbcConnection;
	}

	public void setJdbcConnection(ComponentJdbcConnnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
		
	}
		
	
	
}
