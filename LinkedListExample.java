package comm.codegnan.day28;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {

		LinkedList linkedlist = new LinkedList();
		linkedlist.add("AAA");
		linkedlist.add("BBB");
		linkedlist.add("CCC");
		linkedlist.add("DDD");
		System.out.println(linkedlist);

		// addFirst and addLast
		
		linkedlist.addFirst("XXX");
		linkedlist.addLast("YYY");
		System.out.println(linkedlist);

		// getFirst and getLast
		
		System.out.println(linkedlist.getFirst());
		System.out.println(linkedlist.getLast());

		// removeFirst and removeLast

		System.out.println(linkedlist.removeFirst());
		System.out.println(linkedlist.removeLast());

		System.out.println(linkedlist);

	}

}
