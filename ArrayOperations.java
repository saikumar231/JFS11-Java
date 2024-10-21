package com.codegnan.day35;

import java.util.Scanner;

interface CrudOperations {
	public void insert(int element);

	public void update(int index, int element);

	public void delete(int index);

	public void display();

	public int sum();
}

public class ArrayOperations implements CrudOperations {
	private int[] arr;
	private int size;
	private int capacity;

	public ArrayOperations(int capacity) {
		this.capacity = capacity;
		this.arr = new int[capacity];
		this.size = 0;
	}

	public void insert(int element) {
		if (size < capacity) {
			arr[size++] = element;
			System.out.println("Inserted: " + element);
		} else {
			System.out.println("Array is full. Cannot insert.");
		}
	}

	public void update(int index, int element) {
		if (index >= 0 && index < size) {
			arr[index] = element;
			System.out.println("Updated index " + index + " to " + element);
		} else {
			System.out.println("Invalid index. Cannot update.");
		}
	}

	public void delete(int index) {
		if (index >= 0 && index < size) {
			for (int i = index; i < size - 1; i++) {
				arr[i] = arr[i + 1];
			}
			size--;
			System.out.println("Deleted element at index " + index);
		} else {
			System.out.println("Invalid index. Cannot delete.");
		}
	}

	public void display() {
		System.out.println("Array elements:");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
	}

	public int sum() {
		int total = 0;
		/*for (int element : arr) {
			total += element;
		}*/
		return total;
		}
	

	private static int calculateSum(int[] arr) {

		int total = 0;
		for (int element : arr) {
			total += element;
		}
		return total;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the capacity of the array:");
		int capacity = scanner.nextInt();
		ArrayOperations ops = new ArrayOperations(capacity);

		while (true) {
			System.out.println("Choose an operation: 1) Insert 2) Update 3) Delete 4) Addition 5) Display 6) Exit ");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the element to insert:");
				int elementToInsert = scanner.nextInt();
				ops.insert(elementToInsert);
				break;
			case 2:
				System.out.println("Enter the index to update:");
				int indexToUpdate = scanner.nextInt();
				System.out.println("Enter the new element:");
				int elementToUpdate = scanner.nextInt();
				ops.update(indexToUpdate, elementToUpdate);
				break;
			case 3:
				System.out.println("Enter the index to delete:");
				int indexToDelete = scanner.nextInt();
				ops.delete(indexToDelete);
				break;
			case 4:
				int sum = ArrayOperations.calculateSum(ops.arr);
				System.out.println("The sum of the elements is: " + sum);
				break;
			case 5:
				ops.display();
				break;
			case 6:
				System.out.println("Exiting...");
				scanner.close();
				return;

			default:
				System.out.println("Invalid choice. Try again.");
			}
		}
	}

}