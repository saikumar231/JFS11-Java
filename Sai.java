package com.codegnan.Day21;

abstract class vehicle{
	public abstract int getNoOfWheels();
}
class Bus extends vehicle{
	public int getNoOfWheels() {
		return 7;
	}
}	
class Auto extends vehicle{
	public int getNoOfWheels(){
		return 3;
	}
}

public class Sai {

	public static void main(String[] args) {
		Bus bus = new Bus();
		Auto auto = new Auto();
		System.out.println("Bus wheels: "+bus.getNoOfWheels());	
		System.out.println("Auto wheels: "+auto.getNoOfWheels());	

	}

}
