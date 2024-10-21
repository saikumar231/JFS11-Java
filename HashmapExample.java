package com.codegnan.day34;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, "AAA");
		map.put(2, "BBB");
		map.put(3, "CCC");
		map.put(4, "DDD");
		map.put(5, "EEE");
		System.out.println(map);
		map.put(2, "XXX");
		System.out.println(map);
		map.put(null, "FFF");
		System.out.println(map);
		//Adding duplicate values
		map.put(6, "CCC");
		System.out.println(map);
		map.put(7, "null");
		System.out.println(map);
		map.put(null, "null");
		System.out.println(map);
		map.put(new StringBuffer("xxx"),new Integer(10000));
		System.out.println(map);

	}

}
