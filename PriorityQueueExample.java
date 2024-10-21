package com.codegnan.day33;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(5);
		pq.add(2);
		pq.add(6);
		pq.add(1);
		pq.add(4);
		pq.add(3);
		System.out.println(pq);
		
// printing the same elements in reverse order
		PriorityQueue<Integer> p = new PriorityQueue<>(Comparator.reverseOrder());
		p.add(5);
		p.add(2);
		p.add(6);
		p.add(1);
		p.add(4);
		p.add(3);
		System.out.println(p);
		
	}

}
