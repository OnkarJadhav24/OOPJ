package org.example.main;

import java.util.Scanner;

public class Program {
	private static void sum() {	//Method definition
		try (Scanner sc = new Scanner(System.in);) {

			System.out.print("Num1	:	");
			int num1 = sc.nextInt();

			System.out.print("Num2	:	");
			int num2 = sc.nextInt();

			int result = num1 + num2;
			System.out.println("Result	:	" + result);

		}
	}
	public static void main(String[] args) {
		Program.sum(); // Method call
	}


}
