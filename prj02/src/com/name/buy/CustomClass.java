package com.name.buy;

public class CustomClass {
	int id;				//회원 번호
	String name;		//회원 이름
	int age;			//회원 나이
	
	ProductClass[] shopingBasket;			//물품을 저장할 장바구니
	//int[] shopingBasket = new ProductClass[10];
	
	
	public CustomClass(String name, int id, int age, ProductClass[] shopingBasket) { //순서 맞춰야 함
		this.name = name;
		this.id = id;
		this.age = age;
		//this.shopingBasket = shopingBasket;

	}
	
	void CustomInfo() {
		System.out.printf("회원이름: %s, 회원번호: %d, 회원나이: %d \n", name, id, age);
	}
	
}
//회원 만들기