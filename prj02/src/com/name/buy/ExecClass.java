package com.name.buy;

public class ExecClass {
	public static void main(String[] args) {
		//1. 회원등록
		CustomClass c1 = new CustomClass("한지수", 1001, 27, new ProductClass[10]);
		CustomClass c2 = new CustomClass("홍길동", 2001, 20, new ProductClass[10]);
		CustomClass c3 = new CustomClass("김철수", 3001, 31, new ProductClass[10]);
		
		c1.CustomInfo();
		c2.CustomInfo();
		c3.CustomInfo();
		
		//2. 상품등록: 새우깡(100개-1000원), 콜라(500개-2000원), 젤리(1000개-800원), 빼빼로(300개-1500원), 사이다(500개-2000원)
		ProductClass p1 = new ProductClass(1002, "새우깡", 1000, 100);
		ProductClass p2 = new ProductClass(2002, "콜라", 2000, 500);
		ProductClass p3 = new ProductClass(3002, "젤리", 800, 1000);
		ProductClass p4 = new ProductClass(4002, "빼빼로", 1500, 300);
		ProductClass p5 = new ProductClass(5002, "사이다", 2000, 500);
		
		p1.ProInfo();
		p2.ProInfo();
		p3.ProInfo();
		p4.ProInfo();
		p5.ProInfo();
		
	}
}

//상품 구매: 장바구니에 담기
//c3.addToCart(물건, 수량);
//c3가 새우깡을 70개 담았습ㄴ다.
//c1이 새우깡을 50개 담으려 할대 - '구입할 수 없습니다. 현재 남아있는 구매 가능 수량은 30개 입니다.' 출력
//재고가 남지 않았을때 '구입할 수 없습니다. 구매할 수 있는 수량은 00개 입니다.'-출력


//상품 구매: 결제하기
//c3.purchase(); 김철수가(이) 새우깡을 00개 구매하였습니다-출력되도록

