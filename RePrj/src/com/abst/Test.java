package com.abst;

class A {
	public static final int a = 10;		//상수이기 때문에 static이 없으면 오류.
}

public class Test {
	public static void main(String[] args) {
		System.out.printf("a: %d\n", A.a);
	}
}
