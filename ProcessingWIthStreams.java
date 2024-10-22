package com.codegnan.day38;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessingWIthStreams {
// processing with streams
	public static void main(String[] args) {
		ArrayList<Integer>l1=new ArrayList<>();
		for(int i=0;i<=20;i++) {
			l1.add(i);
		}
		System.out.println("Original Elements: "+l1);
		List<Integer>l2 =l1.stream().filter(i->i%2 == 0).collect(Collectors.toList());
		System.out.println("Even Numbers are: "+l2);
		
		ArrayList<String>names=new ArrayList<>();
		names.add("sunny");
		names.add("chinni");
		names.add("bunny");
		names.add("vinny");
		System.out.println(names);
		
		List<String> newName = names.stream().map(s-> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(newName);
		
		
	}

}
