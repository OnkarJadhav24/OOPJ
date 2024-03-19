package org.example.main;

import java.util.Scanner;

class Account{
	//Fields
	private String name;	//Instance Variable	:	null
	private int number;		//Instance Variable	:	0
	private float balance;	//Instance Variable	:	0.0
	
	public void acceptRecord( ){
		Scanner sc = new Scanner(System.in);
		System.out.print("Name	:	");
		this.name = sc.nextLine();
		System.out.print("Number	:	");
		this.number = sc.nextInt();
		System.out.print("Balance	:	");
		this.balance = sc.nextFloat();
	}
	
	public void printRecord( ){
		System.out.println(this.name+"	"+this.number+"	"+this.balance);
	}
}
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
