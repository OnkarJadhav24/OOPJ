package com.example.second;

import com.example.first.A;

public class D extends A{
	public void print( ) {
		//System.out.println("Num1	:	"+num1);	//The field A.num1 is not visible
		//System.out.println("Num2	:	"+num2);	//The field A.num1 is not visible
		//System.out.println("Num3	:	"+num3);	//OK
		System.out.println("Num4	:	"+num4);	//OK
	}
}
