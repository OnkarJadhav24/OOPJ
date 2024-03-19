package org.example.main;

import java.util.Scanner;

import com.example.model.Account;


public class Program {
	private static Scanner sc = new Scanner(System.in);
	public static int menuList( ) {
		System.out.println("0.Exit.");
		System.out.println("1.Accept Record.");
		System.out.println("2.Print Record.");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		Account account = new Account();
		while ( ( choice = Program.menuList() ) != 0 ) {
			switch( choice ) {
			case 1:
				account.acceptRecord();
				break;
			case 2:
				account.printRecord();
				break;
			}
		}
	}
}
