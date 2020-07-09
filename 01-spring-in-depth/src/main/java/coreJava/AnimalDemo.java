package coreJava;

public class AnimalDemo {
	
//	public static final int DOG=1;
//	public static final int CAT=2;
//	public static final int PIG=3;
	
	public static void main(String[] args) {

//		int animal=CAT;

		Animal animal= Animal.CAT;
		
		switch(animal){
		case CAT:
			System.out.println("cat");
			break;
		case DOG:
			System.out.println("dog");
			break;
		case PIG:
			System.out.println("pig");
			break;
		default:
			break;
		
		}

		System.out.println(animal.DOG);
		System.out.println(animal.DOG.name());
		System.out.println(animal.DOG.getClass());
		System.out.println(animal.DOG instanceof Enum);
		
		System.out.println(animal.DOG.getName());
		Animal animal2 = Animal.valueOf("PIG");
		System.out.println(animal2);
	}	
}
