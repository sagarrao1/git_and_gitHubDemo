package coreJava;

class Thing {
	public final static int LUCKY_NUMBER=7;
	public String name;
	public static String description="This is static description";

	public static int count=0;
	
	public int id;
	
	public Thing() {
		id= count;
		count++;
	}

	public void showName() {
		System.out.println("Object id: "+id+":"+name +" : "+ description);
	}
	
	public static void showInfo() {
		System.out.println("Hello");
	}
}

public class ThingDemo{
	public static void main(String[] args) {
		
		System.out.println("Before creating object is "+Thing.count);
		Thing thing1= new Thing();		
		thing1.name="Sagar";
		
		System.out.println("After creating object is "+Thing.count);
		
//		System.out.println(Thing.description);		 
//		System.out.println(thing1.name);
		
		Thing.showInfo();
		thing1.showName();
		System.out.println(Math.PI);
		
		System.out.println(Thing.LUCKY_NUMBER);
		System.out.printf("this is %d quatity and cost is %d",5, 130);
	
		for (int i = 0; i < 20; i++) {
			System.out.printf("%-3d: here is some text\n" , i);
		}
		
	}
}
