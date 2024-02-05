package org.name.calc02;
// 실패
public class Clac08 {
	int a;
	int b;
	double c;
	double d;
	
	Clac08(int a, int b, double c, double d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	void plus() {
		int result = a + b;
		double result1 = c + d;
		System.out.println();
	}
//	double plus(double c, double d) {
//		double result = c + d;
//		return result;
//	}
	
	void sum () {
		System.out.println("a + b: " + (a+b));
	}
	void sub () {
		System.out.println("a - b: " + (a-b));
	}
	void mul () {
		System.out.println("a * b: " + (a*b));
	}
	void div () {
		System.out.println("a / b: " + (a/b));
	}
	
	
	void sum1 () {
		System.out.println("c + d: " + (c+d));
	}
	void sub1 () {
		System.out.println("c - d: " + (c-d));
	}
	void mul1 () {
		System.out.println("c * d: " + (c*d));
	}
	void div1 () {
		System.out.println("c / d: " + (c/d));
	}
}
