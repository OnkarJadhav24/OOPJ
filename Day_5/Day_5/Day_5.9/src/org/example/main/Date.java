package org.example.main;

import java.util.Scanner;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public void acceptRecord( ) {
		Scanner sc = new Scanner( System.in);
		System.out.print("Day	:	");
		this.day = sc.nextInt();
		System.out.print("Month	:	");
		this.month = sc.nextInt();
		System.out.print("Year	:	");
		this.year = sc.nextInt();
	}
	public void printRecord( ) {
		System.out.println(this.day+" / "+this.month+" / "+this.year);
	}
	
	public static void main(String[] args) {
		Date date = new Date();
		date.acceptRecord( );
		date.printRecord( );
	}
}
