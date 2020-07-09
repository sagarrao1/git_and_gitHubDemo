package coreJava;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {

	public static void main(String[] args) {
//		Person p1= new Person(5, "Sagar");
//		Person p2= new Person(87, "Ramu");
//		
		Person[] people = {new Person(12,"sue"),new Person(88,"mike"),new Person(9,"david")};
		
		ArrayList<Person> peopleList=new ArrayList<Person>(Arrays.asList(people));

		try(FileOutputStream fs = new FileOutputStream("people.bin")){
			
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(people);		
			os.writeObject(peopleList);
			os.writeInt(peopleList.size());			
			for (Person person : peopleList) {
				os.writeObject(person);
			}			
			os.close();
			System.out.println("objects are written to file");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
