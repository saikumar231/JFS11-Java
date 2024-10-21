package com.codegnan.day30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EvenNumbersIterator {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		for (int i = 1; i <= 20; i++) {
			list.add(i);
		}
			System.out.println(list);	
			Iterator<Integer> iterator = list.iterator();
			while(iterator.hasNext()) {
				int num = iterator.next();
				if(num%2 != 0) {  // for getting odd numbers logic is (num%2 == 0)
					iterator.remove();
				}
			}
			System.out.println(list);

	}

}
