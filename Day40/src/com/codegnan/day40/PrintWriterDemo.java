package com.codegnan.day40;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			PrintWriter pw = new PrintWriter("sai.txt");
			pw.write(100);   // corresponding character will be print
			pw.print(100);   // passed value will be printed
			pw.write("sai");
			pw.println(10.5);
			pw.print(false);
			pw.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
