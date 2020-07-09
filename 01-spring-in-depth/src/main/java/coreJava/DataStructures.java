package coreJava;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class DataStructures {
	
	private static String[] vehicles= {"car","bus","flight"};
	
	private static String[][] drivers= {{"sue","jack","dave"},
									  {"suresh","naresh"},				
									  {"gouse","rahim","manu","lasya"}	};

	public static void main(String[] args) {
		Map<String, Set<String>> personal= new LinkedHashMap<>();
		
		for (int i = 0; i < vehicles.length; i++) {
			String vehicle = vehicles[i];
			String[] driverList = drivers[i];
			
			Set<String> driverSet = new LinkedHashSet<>();
			for (int j = 0; j < driverList.length; j++) {
				driverSet.add(driverList[j]);				
			}			
			personal.put(vehicle, driverSet);			
		}
		
		{
			Set<String> driverList = personal.get("car");
			for (String vehicle : driverList) {
				System.out.println(vehicle);
			}
		}

		for (String vehicle : personal.keySet()) {
			System.out.print(vehicle+ " : " );
			Set<String> driverList = personal.get(vehicle);
			for (String driver : driverList) {
				System.out.print(driver+" , ");
			}
			System.out.println();
		}
		
	}

}
