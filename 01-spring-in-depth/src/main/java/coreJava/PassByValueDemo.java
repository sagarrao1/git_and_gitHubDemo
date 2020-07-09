package coreJava;

public class PassByValueDemo {

	public static void main(String[] args) {

		PassByValueDemo ap = new PassByValueDemo();
		int value = 4;

//		System.out.println("1... "+value);
//		ap.calculate(value);
//		System.out.println("4... "+value);

		// ================================

		Person person = new Person("bob");
		System.out.println("1... " + person);
		
		ap.show(person);
		System.out.println("4... "+person);

	}

	
	public void show(Person person) {
		System.out.println("2... " + person);
		
		person = new Person("Jack");
		person.setName("Sue");
		System.out.println("3... " + person);
	}
	
//	public void calculate(int value) {
//		System.out.println("2... " + value);
//
//		value = value - 1;
//		System.out.println("3... " + value);
//	}

}
