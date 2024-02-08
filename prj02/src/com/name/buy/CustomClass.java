package com.name.buy;

public class CustomClass {
	int id;				//회원 번호
	String name;		//회원 이름
	int age;			//회원 나이
	
	ProductClass[] shopingBasket;			//물품을 저장할 장바구니
	
	public CustomClass(String name, int id, int age) { //순서 맞춰야 함
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	void CustomInfo() {
		System.out.printf("회원이름: %s, 회원번호: %d, 회원나이: %d", name, id, age);
	}
	
}
//회원 만들기