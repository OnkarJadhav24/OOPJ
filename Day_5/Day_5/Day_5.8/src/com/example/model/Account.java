package com.example.model;

import java.util.Scanner;

public class Account{
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
