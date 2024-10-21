package com.codegnan.day34;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map map = new HashMap();
		
	//put method	
		map.put(101,"SAI");
		map.put(102, "Ramesh");
		map.put(103, "Suresh");
		map.put(105, "Naresh");
		map.put(106, null);
		map.put(null, null);
		System.out.println(map);
		System.out.println();
		
	//putAll method	
		Map map1 = new HashMap();
		map1.putAll(map);
		System.out.println(map1);
		System.out.println();
		
	//get method
		System.out.println(map.get(102));
		System.out.println(map.get(103));
		System.out.println();
		
	//remove method
		System.out.println(map.remove(102));
		System.out.println(map);
		System.out.println();
		
	//size method
		System.out.println(map.size());
		System.out.println();
		
	//isEmpty()	
		//System.out.println(map.isEmpty());
		System.out.println();
		
	//clear method
		//map.clear();
		System.out.println(map);
		System.out.println();
		
	// containskey
		System.out.println(map.containsKey(105));
		System.out.println(map.containsKey(102));
		System.out.println();
		
	//containsValue
		System.out.println(map.containsValue(null));
		System.out.println(map.containsValue("Suresh"));
		System.out.println();
		
	//keyset
		System.out.println(map.keySet());
		System.out.println();
		
	//Values
		System.out.println(map.values());
		System.out.println();
		

	}

}
