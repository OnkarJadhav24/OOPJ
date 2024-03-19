package org.example.main;

import java.util.Scanner;


public class Program {
	public static void sum( int num1, int num2 ) {
		int result = num1 + num2;
		System.out.println("Result	:	"+result);
	}
	public static int sum( int num1, int num2 ) {
		int result = num1 + num2;
		return result;
	}	
	public static void main(String[] args) {
		Program.sum(10, 20);
		
		Program.sum(10, 20);
	}
}
