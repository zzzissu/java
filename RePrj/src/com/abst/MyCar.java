package com.abst;



public class MyCar {
	//멤버변수
	String company;
	String model;
	String color;
//	String company = "현대";
//	String model = "그렌져";
//	String color = "빨강";		// 재사용, 다형성의 한계로 인해 절차지향언어의 형태가 되어버림
	
	//생성자 - 객체 생성과 초기화를 담당
	MyCar() {		// 디폴트 생성자
//		company = "삼성자동차";
//		model = "QM6";
//		color = "빨강";
		this("삼성자동차", "QM6", "빨강");
	}
	MyCar(String company) {
		this.company = company;
	}
	MyCar(String company, String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
	}
	//멤버함수
	void MyCarPrint() {
		System.out.printf("나의 자동차는 %s이고 %s %s입니다.\n", company, color, model);
	}
	
	public static void main(String[] args) {
		MyCar mc1 = new MyCar();
		MyCar mc2 = new MyCar("현대자동차", "그렌져", "흰색");
		mc1.MyCarPrint();
		MyCar mc3 = new MyCar("대우");
		mc3.MyCarPrint();
	}
}
