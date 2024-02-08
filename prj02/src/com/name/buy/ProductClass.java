package com.name.buy;

public class ProductClass {
	int id;			//물품 번호
	String name;	//물품 이름
	int price;		//물품 가격
	int quantity;	//물품 수량
	
	public ProductClass (int id, String name, int price, int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	void ProInfo() {
		System.out.printf("물품번호: %d, 물품이름: %s, 물품가격: %d원, 물품수량: %d개", id, name, price, quantity);
	}
}
//물건