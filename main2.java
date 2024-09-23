package com.codegnan.Day22;

// implementation of multiple interface
interface canRun {
	public abstract void run();
}

interface canClimb {
	public abstract void climb();
}

class Monkey implements canRun, canClimb {

	@Override
	public void climb() {
		System.out.println("Monkey can climb");

	}

	@Override
	public void run() {
		System.out.println("Monkey can Run....");

	}

}

class Cheetah implements canRun {

	@Override
	public void run() {
		System.out.println("Cheetah is running....");

	}

}

public class main2 {

	public static void main(String[] args) {
		Monkey monkey = new Monkey();
		monkey.run();
		monkey.climb();
		Cheetah cheetah = new Cheetah();
		cheetah.run();

	}

}
