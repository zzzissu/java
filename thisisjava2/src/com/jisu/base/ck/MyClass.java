package com.jisu.base.ck;

public class MyClass {
//클래스 구성 멤버: 멤버변수 + 멤버함수 + 생성자
//	--------------멤버변수
	String name;
	int age;
	
	
//	--------------생성자
	MyClass(String name, int age) { //입력을 받을 수 있는 타입 설정
		this.name = name;	//클래스에 있는 name이라는 의미
		this.age = age;
	}
//	--------------멤버함수
	void printMyClass() {
		System.out.println("나의 이름: " + name + ", 나의 나이: " + age);
		//멤버 변수에서 선언한 변수를 멤버함수를 아무렇게나 사용
		//특별한 값을 입력받거나 하지 못함
	}
	
	
	
	
	
}
