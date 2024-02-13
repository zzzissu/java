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
		System.out.printf("물품번호: %d, 물품이름: %s, 물품가격: %d원, 물품수량: %d개 \n", id, name, price, quantity);
	}
	
	boolean check(int quantity1) {		//구입이 가능한지 확인
		return this.quantity >= quantity1 ? true : false;	//참 거짓 구분
	}
	//출력을 모를 때 우선 void로 작성 후 나중에 수정하는게 쉬움
}
//물건