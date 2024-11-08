package com.codegnan.day40;

import java.io.FileWriter;
import java.io.IOException;

public class FileWwriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("sai.txt");
		fw.write(99);
		fw.write("\n");
		char[] ch = {'a','e','i','o','u'};
		fw.write(ch);
		fw.write("\n");
		fw.write("codegnan");
		fw.write("\n");
		fw.write("solutions");
		fw.close();
		System.out.println("writing sucessfully");

	}

}
