package com.jisu.base.ck;

public class MyClassMain {
	public static void main(String[] args) {
		//MyClass를 가져올려면 객체를 생성해야 함
		MyClass m = new MyClass("한지수", 27);   //new MyClass()는 생성자	//MyClass m은 클래스를 불러오는 것
		m.printMyClass(); //m이라는 클래스에 있는 printMyClass의 값을 출력하는 것
	}
}
