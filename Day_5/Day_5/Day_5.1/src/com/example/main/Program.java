package com.example.main;

import com.example.first.A;
import com.example.first.B;
import com.example.first.C;
import com.example.second.D;
import com.example.second.E;

public class Program {
	public static void main(String[] args) {
		E e = new E();
		e.print();
	}
	public static void main4(String[] args) {
		D d = new  D();
		d.print();
	}
	public static void main3(String[] args) {
		C c = new C();
		c.print();
	}
	public static void main2(String[] args) {
		B b = new B( );
		b.print();
	}
	public static void main1(String[] args) {
		A a = new A( );
		a.print();
	}
}
