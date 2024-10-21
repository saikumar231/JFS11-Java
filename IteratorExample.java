package com.codegnan.day30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {
		List<String> list =new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		list.add("eee");
		list.add("fff");
		System.out.println(list);
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
			if(element.equalsIgnoreCase("bbb")) {
				iterator.remove();
				
			}
		}
		System.out.println(list);
		
	}

}
