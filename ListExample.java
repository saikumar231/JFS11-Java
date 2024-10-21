package comm.codegnan.day28;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		//Add
		List list = new ArrayList();
		list.add("AAA");
		list.add("BBB");
		list.add("CCC");
		list.add("DDD");
		System.out.println(list);
		list.add(4,"EEE");
		System.out.println(list);
		list.add(5,"FFF");
		System.out.println(list);
		
		//AddAll
		
		List list1 = new ArrayList();
		list1.add("XXX");
		list1.add("YYY");
		System.out.println(list1);
		list1.addAll(2,list);
		System.out.println(list1);
		
		// remove
		
		System.out.println(list.remove(2));
		System.out.println(list);
		
		// set
		
		System.out.println(list.set(1, "AAA"));
		System.out.println(list);
		
		// get
		
		System.out.println(list.get(3));
		System.out.println(list);
		
		// indexof and last index of 
		
		System.out.println(list.indexOf("AAA"));
		System.out.println(list.lastIndexOf("AAA"));

}
}
