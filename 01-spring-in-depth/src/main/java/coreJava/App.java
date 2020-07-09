package coreJava;

import java.util.ArrayList;
import java.util.Iterator;

class Machine{

	@Override
	public String toString() {
		return "This is Machine ";
	}
	
	public void start() {
		System.out.println("Machine starting");
	}
}

class Camera extends Machine{
	@Override
	public String toString() {
		return "This is Camera ";
	}	
	
	public void snap() {
		System.out.println("Camera snap");
	}
	
}

public class App {

	public static void main(String[] args) {
		ArrayList<Machine> list1 = new ArrayList<>();
		list1.add(new Machine());
		list1.add(new Machine());

		ArrayList<Camera> list2 = new ArrayList<>();
		list2.add(new Camera());
		list2.add(new Camera());
		
		
		
		showList(list2);
		
	}
	public static void showList(ArrayList<? extends Machine> list) {
		for (Machine string : list) {
			System.out.println(string);
			string.start();
//			string.snap();
		}
		
	}

}
