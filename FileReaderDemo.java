package com.codegnan.day40;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		String fileName ="sai.txt";
		try {
			FileReader fr = new FileReader(fileName);
			int i = fr.read();
			
			while(i!=-1) {
				System.out.print((char)i);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		

	}

}
