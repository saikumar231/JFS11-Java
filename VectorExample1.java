package com.codegnan.Day29;

import java.util.Vector;

public class VectorExample1 {

	public static void main(String[] args) {
		Vector vector = new Vector();
		vector.add("AAA");
		vector.addElement("BBB");
		vector.addElement("CCC");
		vector.addElement("DDD");
		vector.addElement("EEE");
		vector.addElement("FFF");
		System.out.println(vector);
		System.out.println(vector.elementAt(2));
		System.out.println(vector.firstElement());
		System.out.println(vector.lastElement());
		System.out.println(vector.remove("BBB"));
		System.out.println(vector);
		System.out.println(vector.removeElement("BBB"));
		System.out.println(vector);
		vector.removeElementAt(2);
		System.out.println(vector);
		vector.removeAllElements();
		System.out.println(vector);
		

	}

}
