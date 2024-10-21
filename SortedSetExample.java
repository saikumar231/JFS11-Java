package com.codegnan.day31;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) {
		SortedSet sortedset =  new TreeSet();
		
		sortedset.add(100);
		sortedset.add(101);
		sortedset.add(104);
		sortedset.add(106);
		sortedset.add(109);
		sortedset.add(110);
		sortedset.add(120);
		System.out.println(sortedset);
		System.out.println(sortedset.first());
		System.out.println(sortedset.last());
		System.out.println(sortedset.tailSet(109));
		System.out.println(sortedset.headSet(109));
		System.out.println(sortedset.subSet(104, 110));
		System.out.println(sortedset.comparator());
		
		
		

	}

}
