package org.example.main;

import java.util.Scanner;


public class Program {
	public static void sum( int num1, int num2 ) {
		int result = num1 + num2;
		System.out.println("Result	:	"+result);
	}
	public static void sum( int num1, double num2 ) {
		double result = num1 + num2;
		System.out.println("Result	:	"+result);
	}
	public static void main(String[] args) {
		Program.sum(10, 20);
		
		Program.sum(10, 20.5);
	}
}