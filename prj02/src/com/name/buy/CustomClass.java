package com.name.buy;
 
public class CustomClass {
	int id;				//회원 번호
	String name;		//회원 이름
	int age;			//회원 나이
	
	ProductClass[] shopingBag;			//물품을 저장할 장바구니
	int i = 0;
	
	public CustomClass(String name, int id, int age, ProductClass[] shopingBag) { //순서 맞춰야 함		//ProductClass[] shopingBag이름과 똑같이 받기
		this.name = name;
		this.id = id;
		this.age = age;
		this.shopingBag = shopingBag;
	}

	void addToCart(ProductClass product, int quantity1) {		//물건, 수량
		boolean ok = product.check(quantity1);		//호출 형태	//내가 받은 구입 물량과 재고 물량을 비교
		//^prod에 있는 참거짓 구분 함수를 가져옴
		if(! ok) {
			System.out.println("수량이 부족합니다. 구입 가능 수량은: " + product.quantity + "입니다.");
		} else {	//구매 가능
			shopingBag[this.i] = product;		//계속 수를 바꿔서 출력 하려면 몇번째 방을 주는것이 아니라 초기화한 변수를 넣어줌
			this.i++;		//1씩 증가시키기
			product.quantity -= quantity1;		//재고 수량 = 재고 수량 - 구입 수량
			String msg = "나이가 " + this.age + "인 " + this.name + "님이 " + product.price + "원 짜리 " + product.name + "을(를) " + quantity1 +  "개를 장바구니에 담았습니다." ;
			System.out.println(msg);
		}
		
	}
	void purchase() {
	      for (int i = 0; i < shopingBag.length; i++) {
		         if(shopingBag[i] != null){
		            System.out.printf("%s님이 %s을(를) 구매 하셨습니다.\n", name, shopingBag[i].name);
		         } 
		      }

	}
	
	void CustomInfo() {
		System.out.printf("회원이름: %s, 회원번호: %d, 회원나이: %d \n", name, id, age);
	}
}
//회원 만들기