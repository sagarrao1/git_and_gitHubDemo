package coreJava;

public class RecursiveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(factorial(4));
	}
	
	public static int factorial(int value) {
		
		System.out.println(value);
		if (value == 1) {
			return 1;
		}
		
		return factorial(value-1)*value;
	}
		

}
