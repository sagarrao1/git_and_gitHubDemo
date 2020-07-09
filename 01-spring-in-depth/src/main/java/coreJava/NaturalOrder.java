package coreJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


class NPerson implements Comparable<NPerson>{
	
	private String name;

	public NPerson(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "NPerson [name=" + name + "]";
	}

	@Override
	public int compareTo(NPerson person) {
		// TODO Auto-generated method stub
		return this.name.compareTo(person.name);
	}	
	
}

public class NaturalOrder {
	
	public static void main(String[] args) {		
		List<NPerson> list = new ArrayList<>();
		Set<NPerson> set = new TreeSet<>();
		
		addElements(list);
		addElements(set);
		
		Collections.sort(list);
		
		showElements(list);
		System.out.println("===================");
		showElements(set);
	}	
	
	private static void addElements(Collection<NPerson> col) {
		col.add(new NPerson("jack"));
		col.add(new NPerson("Tim"));
		col.add(new NPerson("David"));
		col.add(new NPerson("rachel"));
	}

	private static void showElements(Collection<NPerson> col) {
		for (NPerson object : col) {
			System.out.println(object);
		}
	}

}
