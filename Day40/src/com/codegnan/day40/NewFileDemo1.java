package com.codegnan.day40;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class NewFileDemo1 {

    public static void main(String[] args) {
        try (BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
             BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
             PrintWriter pw3 = new PrintWriter("pw3.txt")) {

            String line1, line2;

            while ((line1 = br1.readLine()) != null && (line2 = br2.readLine()) != null) {
                pw3.println(line1);
               pw3.println(line2);
            }

            // Handle remaining lines, if any
            while ((line1 = br1.readLine()) != null) {
                pw3.println(line1);
            }
            while ((line2 = br2.readLine()) != null) {
                pw3.println(line2);
            }

            System.out.println("Merged contents of file1.txt and file2.txt into file3.txt");
        } catch (IOException e) {
            System.err.println("Error merging files: " + e.getMessage());
        }
    }
}
