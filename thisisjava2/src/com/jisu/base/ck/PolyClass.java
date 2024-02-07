package com.jisu.base.ck;

class Car1 {
	Model model;			//인스턴스(객체가 생성되어야 실행 가능)
	void drive() {		//메서드 생성
		model.run();		//실행하기 위해 Model에 run이라는 메서드가 있어야 함.
	}
}

class Model {	
	void run() {
		System.out.println("차가 달립니다.");
	}
}
// ------------------------------------------------------------
class Avante extends Model {
	@Override
	void run() {
		System.out.println("Avante가 달립니다.");
	}
}

class Ramborghini extends Model {	
	@Override
	void run() {
		System.out.println("Ramborghini가 달립니다.");
	}
}

class Bentley extends Model {	
	@Override
	void run() {
		System.out.println("Bentley가 달립니다.");
	}
}

public class PolyClass {
	public static void main(String[] args) {
//		Bentley b = new Bentley();
//		b.run();
//		Ramborghini r = new Ramborghini();
//		r.run();
//		Avante a = new Avante();
//		a.run();
		
		//Car 클래스를 통해서 다형성 사용해서
		//car.drive를 호출하면 나오도록
		Car1 c = new Car1();
		
		c.model = new Model();
		c.drive();
		
		c.model = new Avante();
		c.drive();
		
		c.model = new Bentley();
		c.drive();
		
		c.model = new Ramborghini();
		c.drive();
		
//		Avante avante = new Avante();
//		myCar.drive();
//		
		
	}
}


// Car1(클래스를 불러옴) c(이름 지어줌) = new Car1();(객체를 생성, 생성자)

// c.(c 안에 있는 = 불러온 Car1클래스에 있는)model(Model 타입으로 선언된 model 변수에) = new Model(); (class Model{}을 호출)
// c.drive();(model.run();이 선언되어 있는 함수를 실행)

// c.model = new Avante(); (상속 시켜준 클래스(Avante)를 호출)
// c.drive();
