package org.example.main;

import java.util.Scanner;

public class Program {
	//private static void sum(int a, int b) {	//Method definition
	
	//num1 and num2 are method parameters
	private static void sum(int num1, int num2) {	//Method definition
		int result = num1 + num2;
		System.out.println("Result	:	" + result);
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {

			System.out.print("Num1	:	");
			int num1 = sc.nextInt();

			System.out.print("Num2	:	");
			int num2 = sc.nextInt();

			Program.sum( num1, num2 ); // Method call: num1 and num2 are method arguments
		}
	}
}
