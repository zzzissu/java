package com.jisu.base.ck;

class Car {
	String modelName;  //멤버 변수 = 필드 = 속성
	String carColor;
	int carYear;
}
public class CreateCar {

	public static void main(String[] args) {
		//Car 타입의 변수 c에 Car 클래스의 객체를 집어넣어라 (변수 선언)
		Car c1 = new Car();    //객체 생성(디폴트 생성자 호출)
		//int i = 100;
		Car c2 = new Car();
		Car c3 = new Car();
		//디폴트 생성자(입력이 없는 괄호) : 생성자를 만들지 않아도 사용 가능한 것은 정의가 이미 되어있는것(컴파일러가 자동으로 만들어 줌)
		//생성자는 출력이 없음
		c1.modelName = "차은우";
		c2.modelName = "람보르기니";
		c3.modelName = "부가티";
		System.out.println(c1.modelName);
		System.out.println(c1.carColor);
		System.out.println(c1.carYear);
	}

}
