package coreJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects {

	public static void main(String[] args) {
		System.out.println("Read Objects");

		try(FileInputStream fs= new FileInputStream("people.bin")) {
			ObjectInputStream os= new ObjectInputStream(fs);
			
			Person[] people= (Person[]) os.readObject();
			ArrayList<Person> peopleLs= (ArrayList<Person>) os.readObject();
			
			
			for (Person person : people) {
				System.out.println(person);
			}
			System.out.println();
			
			for (Person person : peopleLs) {
				System.out.println(person);
			}
			
			int num=  os.readInt();			
			for (int i = 0; i < num; i++) {
				Person person= (Person) os.readObject();
				System.out.println(person);
			}
			
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
