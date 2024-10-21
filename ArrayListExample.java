package comm.codegnan.day28;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class ArrayListExample {

	public static void main(String[] args) {
		Collection collection = new HashSet();
		collection.add("AAA");
		collection.add("BBB");
		collection.add("CCC");
		collection.add("DDD");
		System.out.println(collection);
		ArrayList arraylist = new ArrayList(collection);
		System.out.println(arraylist);
		
		
		
		ArrayList fruits = new ArrayList();
		fruits.add("apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("grapes");
		fruits.add("Kiwi");
		System.out.println(fruits);
		
		// adding duplicate elements
		fruits.add("grapes");
		System.out.println(fruits);
		
		// adding null elements
		fruits.add(null);
		System.out.println(fruits);
		fruits.add(null);
		System.out.println(fruits);
		
		// adding heterogeneous elements
		
		fruits.add(50);
		System.out.println(fruits);
		
		//adding wrapper class
		fruits.add(new Integer(30));
		System.out.println(fruits);
		
		

	}

}
