package com.jisu.base;

public class MethodTest {
	
	int num;
	String name;
	
	public static void method1() {         //method1 선언, 정의(입력 X, 출력X)
		System.out.println("method1() 실행");
	}
	public static void method2(int num) {	//입력이 있는 형태
		System.out.println("나는 입력하나 갖는 메서드: " + num);
	}
	public static int method3(int num) {	//입력과 출력이 있는 형태
		int n;        //지역 변수
		System.out.printf("나는 입력과 출력을 가지는 메서드: 입력 %d, 출력 %d\n", num, num);
		n = num;
		return n;           //메서드의 출력 	//void가 아니기 때문에 리턴 시켜줘야함
	}
	
	public static void main(String[] args) {
		method1();   //method1() 메서드 호출 -> 호출해야 실행됨
		method2(100);
		int res = method3(1);
		System.out.println("리턴 값: " + res);
	}
}
