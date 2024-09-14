package com.codegnan.Day17;

public class SimpleIntrestCalculator {
	private double principle;
	private double rate;
	private int time;

	// for getting the constructor  below 9 to 14 th line right click--> source --> generate constructor to fields
	public SimpleIntrestCalculator(double principle, double rate, int time) {
		super();
		this.principle = principle;
		this.rate = rate;
		this.time = time;
	}
// from 16 to 43 lines right click--> source --> getters& setters
	public double CalculateSimpleIntrest() {
		double interest = (principle * time * rate) / 100;
		return interest;
	}

	public double getPrinciple() {
		return principle;
	}

	public void setPrinciple(double principle) {
		this.principle = principle;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public static void main(String[] args) {
		SimpleIntrestCalculator calculator= new SimpleIntrestCalculator(1000,5,2) ;
		double interest = calculator.CalculateSimpleIntrest();
		System.out.println("SimpleInterest: "+interest);
		calculator.setPrinciple(1500);
		interest= calculator.CalculateSimpleIntrest();
		System.out.println("Updated simple Interset: "+interest);
		

	}

}
