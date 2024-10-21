package com.codegnan.day33;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueExample {

	public static void main(String[] args) {
		Deque<Integer> dq = new ArrayDeque<>(4);
		/*dq.addFirst(5);
		dq.addFirst(2);
		dq.addFirst(6);
		dq.addFirst(1);
		dq.addFirst(4);
		dq.offerFirst(3);
		dq.addLast(10);*/
		/*System.out.println(dq.offerLast(10));
		System.out.println(dq.offerLast(11));
		System.out.println(dq.removeFirst());
		System.out.println(dq);
		System.out.println(dq.removeLast());
		System.out.println(dq);*/
		//System.out.println(dq.getFirst());
		System.out.println(dq);
		System.out.println(dq.peekFirst());
		System.out.println(dq.peekLast());
		System.out.println(dq.pollFirst());
		System.out.println(dq.pollLast());	
	
		

	}

}
