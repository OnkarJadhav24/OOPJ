package org.example.main;

import java.util.Scanner;

class Account{
	//Fields
	private String name;	//Instance Variable	:	null
	private int number;		//Instance Variable	:	0
	private float balance;	//Instance Variable	:	0.0
	
	
	public void setRecord(String name, int number, float balance) {
		this.name = name;
		this.number = number;
		this.balance = balance;
	}
	
	public void acceptRecord( ){
		try( Scanner sc = new Scanner(System.in)){
			System.out.print("Name	:	");
			this.name = sc.nextLine();
			System.out.print("Number	:	");
			this.number = sc.nextInt();
			System.out.print("Balance	:	");
			this.balance = sc.nextFloat();
		}
	}
	
	public void printRecord( ){
		System.out.println(this.name+"	"+this.number+"	"+this.balance);
	}
}
public class Program {
	public static void main(String[] args) {
		Account account = new Account();	//Instantiation
		
		//Message Passing
		//account.acceptRecord(  );	//account.acceptRecord( account );	
		//Java: acceptRecord method is called on account instance
		//OOPS: acceptRecord message is sent to account object
		
		account.printRecord( );	//account.printRecord( account );
		//Java: printRecord method is called on account instance
		//OOPS: printRecord message is sent to account object
		
	}
}
