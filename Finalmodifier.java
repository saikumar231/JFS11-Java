package com.codegnan.Day19.oops;
// instance variable
public class Finalmodifier {

	//static final int x =10;
	/*static final int x;
	static{
		x=10;
	}*/
	
	public static void main(String[] args) {
		/*
		 * final int x=10; System.out.println(x);
		 */
//------------------------------------------------------	
		/*
		 * final int x; { x=10; } System.out.println(x);
		 */
//-------------------------------------------------------
		Demo demo =new Demo();
		int x=10;
		System.out.println(x);
	}

	/*final int x;

	public Finalmodifier() {

		x = 20;
		System.out.println(x);
	}*/

}
