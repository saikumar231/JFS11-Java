package com.codegnan.day40;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) {
		String fileName = "sai.txt";
		try {
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(100);
			bw.newLine();
			char[] ch = {'a','b','c','d','e','f'};
			bw.write(ch);
			bw.newLine();
			bw.write("@Hello Codegnan");
			bw.flush();
			System.out.println("Written Successfully");
			bw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
