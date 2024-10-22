package com.codegnan.day38;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeApi {
// write a java program to display system current date and time
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("Current Date: "+date);
		
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yy = date.getYear();
		
		System.out.printf("Formatted Date is : %d-%d-%d",dd,mm,yy);
		System.out.println();
		
		System.out.println("Day : "+dd);
		System.out.println("Month : "+mm);
		System.out.println("Year : "+yy);
		System.out.println();
		
		
		LocalTime time = LocalTime.now();
		System.out.println("Current Time: "+time);
		
		
		int h = time.getHour();
		int m = time.getMinute();
		int s= time.getSecond();
		int n = time.getNano();
		System.out.println("Hour: "+h);
		System.out.println("Minute: "+m);
		System.out.println("Seconds: "+s);
		System.out.println("Nano Seconds: "+n);
		
		System.out.printf("Formated Time is: %d:%d:%d:%d",h,m,s,n);
		System.out.println();
		LocalDateTime dt= LocalDateTime.now();
		System.out.println("Current date and time is: "+dt);
		System.out.println();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		String formattedDateTime = dt.format(formatter);
		System.out.println(formattedDateTime);
		

	}

}
