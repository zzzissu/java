package ch06.sec07.exam04;

public class Car {
	//필드선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자 선언
	Car() {}                                //1번 생성자
	
	Car(String model) {                     //2번 생성자
		this.model = model;
	}
	
	Car(String model, String color) {       //3번 생성자
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed) { //4번 생성자
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
