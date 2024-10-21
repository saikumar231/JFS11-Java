package com.codegnan.day31;

import java.util.HashMap;
import java.util.Scanner;
 
public class AnagramExample {
 
// write the code..
	public static boolean areAnagrams(String str1, String str2) {
    	if (str1.length() != str2.length()) {
        	return false;
    	}
    	HashMap<Character, Integer> charCount = new HashMap<>();
    	for (char c : str1.toCharArray()) {
        	charCount.put(c, charCount.getOrDefault(c, 0) + 1);
    	}
    	for (char c : str2.toCharArray()) {
        	charCount.put(c, charCount.getOrDefault(c, 0) - 1);
 
        	if (charCount.get(c) < 0) {
            	return false;
        	}
    	}
    	return true;
	}
 
	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter string1: ");
    	String str1 = scanner.nextLine();
    	System.out.println("Enter string2: ");
    	String str2 = scanner.nextLine();
 
    	if (areAnagrams(str1, str2)) {
 
        	System.out.println(str1 + " and " + str2 + " are anagrams");
    	} else {
        	System.out.println(str1 + " and " + str2 + " are not anagrams");
    	}
    	scanner.close();
	}
}
