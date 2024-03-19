package com.example.second;

import com.example.first.A;

public class E {
	public void print( ) {
		A a = new A();
		//System.out.println("Num1	:	"+a.num1);	//The field A.num1 is not visible
		//System.out.println("Num2	:	"+a.num2);	//The field A.num1 is not visible
		//System.out.println("Num3	:	"+a.num3);	//The field A.num1 is not visible
		System.out.println("Num4	:	"+a.num4);	//OK
	}
}
