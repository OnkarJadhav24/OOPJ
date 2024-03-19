package org.example.main;

class Test{
	//Non static method / instance method
	public void showRecord( ) {
		System.out.println("Inside showRecord()");
	}
	
	//static method / class level method
	public static void displayRecord( ) {
		System.out.println("Inside displayRecord()");
	}
}
public class Program {
	public static void main(String[] args) {
		String str = new String( "CDAC" );
		char ch = str.charAt(1);
		
		int number = 123;
		String strNumber = String.valueOf(number);
	}
	public static void main2(String[] args) {
		Test.displayRecord();//OK
		
		Test t = new Test();
		t.displayRecord();	//Warning: The static method displayRecord() from the type Test should be accessed in a static way
	}
	public static void main1(String[] args) {
		Test t = new Test( );
		t.showRecord();	//OK
		
		//Test.showRecord();	//Not OK: Cannot make a static reference to the non-static method showRecord() from the type Test
	}
}
