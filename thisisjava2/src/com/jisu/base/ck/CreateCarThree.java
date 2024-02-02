package com.jisu.base.ck;

     //2. 생성자를 이용한 초기화
class CarThree {
	String kind = "세단";
	String modelName;
	String carColor;
	int carYear;
	
	CarThree(){   //디폴트 생성자 : 입력이 없는 생성자
		System.out.println("나는 디폴트 생성자입니다.");
		// == System.out.printf("나는 디폴트 생성자입니다.\n");
		
	}
	CarThree(String modelName, String carColor, int carYear) {
		this.modelName = modelName;
		this.carColor = carColor;
		this.carYear = carYear;
		System.out.printf("나는 매개변수 세 개를 갖는 생성자입니다.\n");
	}
	//CarThree는 생성자 3개를 갖고있음 = 오버로딩 : 입력값의 타입이 다르거나 
}
public class CreateCarThree {
	public static void main(String[]args) {
		//CarThree c = new CarThree();    //자동으로 디폴트 생성자를 호출
		CarThree c1 = new CarThree("벤츠", "검정", 2024);
		System.out.printf("나의 차 종류는 %s이고 색상은 %s이고 연식은 %d식 입니다.", c1.modelName, c1.carColor, c1.carYear);
	}
}
