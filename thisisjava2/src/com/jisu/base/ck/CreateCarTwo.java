package com.jisu.base.ck;

	//1. Setter 이용하여 초기화하기(변수를 초기화시켜주는 함수)
class Cartwo {
	//---------------------------------------------멤버변수, 속성, 필드
	String kind = "세단"; //공통으로 적용될 속성은 초기화를 진행한다.
	String modelName;
	String carColor;
	int carYear;
	//----------------------------------------------메서드(멤버함수), 기능, 행위
	public void setModelName(String modelName) {    //메서드
		//modelName을 set시켜주는 것이라고 표기해두면 편함
		//()안에 있는 modelName은 setModelName 클래스 안에서만 사용 가능한 함수
		this.modelName = modelName;
		//modelName = modelName;으로 사용할 때 구분이 힘들기 때문에 this.으로 구분(this.은 속성에 있는 함수라는 것을 의미해줌)
	}
	public void setcarColor(String carColor) {
		this.carColor = carColor;
	}
	public void setcarYear(int carYear) {
		this.carYear = carYear;
	}
}
public class CreateCarTwo {
	public static void main(String[] args) {
		Cartwo c = new Cartwo();
		c.setModelName("람보르기니");
		System.out.println(c.modelName);
		
		c.setcarColor("흰색");
		System.out.println(c.carColor);
		c.setcarYear(2024);
		System.out.println(c.carYear);
		System.out.println("제 차의 종류는 " + c.modelName + "이고 차의 색상은 " + c.carColor + "입니다. 연식은 " + c.carYear + "년식 입니다.");
	}
}
