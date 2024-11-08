package com.codegnan.day40;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		try {
			BufferedReader br = new BufferedReader(new FileReader("sai.txt"));
			String line = br.readLine();
			while(line!= null) {
				System.out.println(line);
				line = br.readLine();
			}
			br.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}
		System.out.println("Data has retrived successfully");
	}

}
