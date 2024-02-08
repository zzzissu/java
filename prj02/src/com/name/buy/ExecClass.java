package com.name.buy;

public class ExecClass {
	public static void main(String[] args) {
		//1. 회원등록
		CustomClass c1 = new CustomClass("한지수", 1, 27);
		CustomClass c2 = new CustomClass("홍길동", 2, 20);
		CustomClass c3 = new CustomClass("김철수", 3, 31);
		
		c1.CustomInfo();
		
		//2. 상품등록 :  새우깡(100개-1000원), 콜라(500-2000원), 천하장사 소세지(1000-800원)
		//빼빼로(300-1500원), 사이다(500-2000원)
		
		ProductClass p1 = new ProductClass(10, "새우깡", 1000, 100);
		
		p1.ProInfo();
	}
}

//상품 구매: 장바구니에 담기
//c3.addToCart(물건, 수량);
//c3가 새우깡을 70개 담았습ㄴ다.
//c1이 새우깡을 50개 담으려 할대 - '구입할 수 없습니다. 현재 남아있는 구매 가능 수량은 30개 입니다.' 출력
//재고가 남지 않았을때 '구입할 수 없습니다. 구매할 수 있는 수량은 00개 입니다.'-출력


//상품 구매: 결제하기
//c3.purchase(); 김철수가(이) 새우깡을 00개 구매하였습니다-출력되도록

