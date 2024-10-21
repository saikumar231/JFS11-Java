package com.codegnan.day34;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntrySetExample {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(101, "sai");
		map.put(102, "ramesh");
		map.put(103, "suresh");
		map.put(104, "naresh");
		System.out.println(map);
		Set set = map.entrySet();
		for (Object obj : set) {
			Map.Entry entry = (Map.Entry) obj;
			Object key = entry.getKey();
			if ((Integer) key == 103) {
				entry.setValue("AAA");
			}
			Object value = entry.getValue();
			System.out.println(key + " => " + value);
		}

	}

}
