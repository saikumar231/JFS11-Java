package com.codegnan.day37;

import java.util.function.Supplier;

public class RandomOtpGenerator {

	public static void main(String[] args) {
		Supplier<String>s=()->{
			String otp = " ";
			for(int i=0;i<6;i++) {
				otp = otp +(int)(Math.random()*10);
			}
			return otp;
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());

	}

}
