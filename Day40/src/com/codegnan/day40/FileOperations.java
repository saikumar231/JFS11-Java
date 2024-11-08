package com.codegnan.day40;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {
    public static void main(String[] args) {
        String fileName = "myFile.txt";
        File file = null;

        // Create a new file (check if creation is successful)
        try {
            file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }

        // Check if file exists before writing, reading, appending, or deleting
        if (file != null && file.exists()) {
            // Write to the file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                writer.write("Hello, world!\nThis is a test file.");
            } catch (IOException e) {
                System.out.println("An error occurred while writing to the file.");
                e.printStackTrace();
            }

            // Read from the file
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("An error occurred while reading the file.");
                e.printStackTrace();
            }

            // Append to the file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
                writer.write("\nAppended text.");
            } catch (IOException e) {
                System.out.println("An error occurred while appending to the file.");
                e.printStackTrace();
            }
        } else {
            System.out.println("File does not exist. Skipping operations.");
        }

        // Delete the file (check if deletion is successful)
        if (file != null && file.exists()) {
            if (file.delete()) {
                System.out.println("Deleted the file: " + fileName);
            } else {
                System.out.println("Failed to delete the file.");
            }
        }
    }
}