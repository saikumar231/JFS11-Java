package com.codegnan.day40;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class NewDemo {

	public static void main(String[] args) throws FileNotFoundException {
		try(PrintWriter pw1 = new PrintWriter("file1.txt")){
			pw1.println(6666);
			pw1.println(7777);
			pw1.println(8888);
		}catch(IOException e) {
			System.out.println("An Error occured while writing to file1.txt"+e.getMessage());
		}
		try(PrintWriter pw1 = new PrintWriter("file2.txt")){
			pw1.println("aaaa");
			pw1.println("bbbb");
			pw1.println("cccc");
		}catch(IOException e) {
			System.out.println("An Error occured while writing to file1.txt"+e.getMessage());
		}
		
		try(BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
			BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
				PrintWriter pw3 = new PrintWriter (new FileWriter("pw3.txt"))){
			String line;
			while((line = br1.readLine())!=null) {
				pw3.println(line);
				
			}
			while((line = br2.readLine())!=null) {
				pw3.println(line);
			}
			System.out.println("Merger contents file1.txt and file2.txt into file3");
		}catch(Exception e) {
			System.out.println("AN ERROR OCCURED WHILE "+e.getMessage());
		}
		
	}

}
