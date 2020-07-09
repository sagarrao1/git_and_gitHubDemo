package coreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StringComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		int len1= o1.length();
		int len2= o2.length();
		
		if (len1 > len2) {
			return 1;
		}else if (len1< len2) {
			return -1;
		}
		
		return 0;
	}
	
}

class ReverseAlphbaticalComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return -o1.compareTo(o2);
	}
	
}

public class SortDemo {

	public static void main(String[] args) {
		ArrayList<String> str= new ArrayList<String>();
		str.add("sagar");
		str.add("bab");
		str.add("masdhu");
		str.add("ravinder");
		
		Collections.sort(str, new ReverseAlphbaticalComparator());
		
		for (String string : str) {
			System.out.println(string);
		}
		System.out.println("======================");
		
		ArrayList<Integer> num= new ArrayList<Integer>();
		num.add(15);
		num.add(8);
		num.add(4);
		num.add(91);
		
		Collections.sort(num, new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return -o1.compareTo(o2);
			}
			
		}
		);
		
		for (Integer i : num) {
			System.out.println(i);
		}
		System.out.println("======================");
		
		Person p1 =new Person(1,"Bob");		
		Person p3 =new Person(3,"Ram");
		Person p4 =new Person(2,"Suresh");		
		
		ArrayList<Person> people= new ArrayList<Person>();
		people.add(p1);
		people.add(p3);
		people.add(p4);
		
//		Collections.sort(people, new Comparator<Person>() {
//
//			@Override
//			public int compare(Person o1, Person o2) {
//				// TODO Auto-generated method stub
//				if (o1.getId() > o2.getId()) {
//					return 1;
//				}else if (o1.getId() < o2.getId()) {
//					return -1;
//				}
//				return 0;
//			}
//			
//		});
		
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				
				return o1.getName().compareTo(o2.getName());
			}
			
		});

		for (Person person : people) {
			System.out.println(person);
		}
	}

}
