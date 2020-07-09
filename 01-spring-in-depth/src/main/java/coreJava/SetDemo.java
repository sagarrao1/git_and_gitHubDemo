package coreJava;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> set1= new HashSet<String>();
		
		if (set1.isEmpty()) {
			System.out.println("set is empty");
		}
		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("rat");
		set1.add("dockey");
		set1.add("mouse");
		
		for (String string : set1) {
			System.out.println(string);
		}
		if (set1.isEmpty()) {
			System.out.println("set is empty");
		}

		Set<String> set2= new HashSet<String>();
		
		if (set1.isEmpty()) {
			System.out.println("set is empty");
		}
		set2.add("tiger");
		set2.add("jiraffe");
		set2.add("mouse");
		set2.add("rat");
		set2.add("pig");
		System.out.println("=============================");
		for (String string : set2) {
			System.out.println(string);
		}
		System.out.println("=============================");

		Set<String> intersection = new HashSet<String>(set1);
		intersection.removeAll(set2);
		for (String string : intersection) {
			System.out.println(string);
		}
		
		

	}

}
