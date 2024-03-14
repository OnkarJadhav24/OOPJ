package com.cdac;

public class WideningAllDT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=45;
		float f=i;
		double d = i;
		boolean b = (i!=0);
		String s=Integer.toString(i);
		
		System.out.println(" Int to float  :"+f);
		System.out.println(" Int to double  :"+d);
		System.out.println(" Int to boolean  :"+b);
		System.out.println(" Int to String  :"+s);
		
		
	}

}
