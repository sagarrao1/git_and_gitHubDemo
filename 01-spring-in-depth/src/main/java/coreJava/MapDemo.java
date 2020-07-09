package coreJava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "one");		
		map.put(3, "three");
		map.put(4, "four");
		map.put(2, "two");
		map.put(1, "one");
		
//		for (Integer key : map.keySet()) {
//			System.out.println(key+": "+map.get(key));
//		}
//		System.out.println("=============");
//		
//		for (Entry<Integer, String> entry: map.entrySet()) {
//			Integer i = entry.getKey();
//			String s = entry.getValue();
//			System.out.println(i+": "+s);
//			
//		}
//		System.out.println("=============");
//		Set<String> set = new HashSet<String>();
//		
//		set.add("dog");
//		set.add("cat");
//		set.add("mouse");
//		set.add("dog");
//		
//		for (String string : set) {
//			System.out.println(string);
//		}

		Person p1 =new Person(1,"Bob");
		Person p2 =new Person(2,"Suresh");
		Person p3 =new Person(3,"Ram");
		Person p4 =new Person(2,"Suresh");
		
		Map<Integer, Person> mapPerson= new LinkedHashMap<Integer,Person>();
		mapPerson.put(1, p1);
		mapPerson.put(2, p2);
		mapPerson.put(3, p3);
		mapPerson.put(2, p4);
		
		for (Integer key : mapPerson.keySet()) {
		System.out.println(key+": "+mapPerson.get(key));
	}
		System.out.println("=============");
		Set<Person> setP = new LinkedHashSet<Person>();
		
		setP.add(p1);
		setP.add(p2);
		setP.add(p3);
		setP.add(p4);
		
		for (Person string : setP) {
			System.out.println(string);
		}

	}
}
