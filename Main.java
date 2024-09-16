package com.codegnan.Day19.oops;

class parent{
	public void methodOne() {
		System.out.println("parent class m1 method");
	}
}
class child extends parent{
	public void methodTwo() {
		System.out.println("child class m2 method");
	}
}

public class Main {

	public static void main(String[] args) {
		parent p1=new parent();
		p1.methodOne();
		
		child c1=new child();
		c1.methodOne();
		c1.methodTwo();
		
		parent p2 = new parent();
		p2.methodOne();

	}

}
