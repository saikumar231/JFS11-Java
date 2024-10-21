package com.codegnan.day33;

import java.util.Scanner;

public class NutrientsCalculator {
	// Method to calculate the approximate calorie count based on user'smeal preferences
	 
		public static int calculateCalories(String mealChoice, boolean addCheese, boolean addMeat) {
	    	int caloriecount = 0;
	    	switch (mealChoice.toLowerCase()) {
	    	case "salad":
	        	caloriecount = 150;
	        	break;
	    	case "sandwich":
	        	caloriecount = 300;
	        	break;
	    	case "pasta":
	        	caloriecount = 400;
	        	break;
	    	default:
	        	System.out.println("Invalid meal Choice");
	        	return 0;
	    	}
	    	if (addCheese) {
	        	caloriecount += 100;
	    	}
	    	if (addMeat) {
	        	caloriecount += 150;
	 
	    	}
	    	return caloriecount;
		}
	 
		public static void main(String[] args) {
	    	Scanner scanner = new Scanner(System.in);
	    	System.out.print("Choose your meal (salad/sandwich/pasta): ");
	    	String mealChoice = scanner.nextLine();
	    	System.out.print("Do you want to add cheese? (true/false): ");
	    	boolean addCheese = scanner.nextBoolean();
	    	System.out.print("Do you want to add meat? (true/false): ");
	    	boolean addMeat = scanner.nextBoolean();
	    	int calorieCount = calculateCalories(mealChoice, addCheese, addMeat);
	    	System.out.println("Approximate Calorie Count: " + calorieCount + " calories");
	    	scanner.close();
		}
	}

