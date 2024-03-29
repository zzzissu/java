package com.tcp.test01;

class Animal {
	int num = 10;
	String name;	// 멤버변수
	Animal() {
		System.out.println("Animal 생성자");
	}
	void setName(String name) {		//멤버함수
		this.name = name;
	}
}

class Dog extends Animal {		// Animal 클래스 상속
	// 기능 확장
	int num = 20;
	Dog() {
		System.out.println("Dog 생성자");
	}
	void sleep() {
		System.out.println(this.name + "(이)가 " + "Zzz..");
	}
}

class HouseDog extends Dog {
	int num = 30;
	HouseDog() {}
	HouseDog(String name) {	// 클래스 이름과 동일한 메서드, 출력 X - 생성자(객체생성과 초기화)
		this.setName(name);
		System.out.println("HouseDog 생성자");
	}
	@Override
	void sleep() {
		// 상속받은 멤버함수 그대로 사용(overRiding, 재정의)
		System.out.println(this.name + "(이)가 " + "쿨쿨..");
	}
	void sleep(String h) {		// 다중정의
		System.out.println(this.name + "(이)가 " + "하암.." + h + "잔다..");
	}
	void numPrint() {
		System.out.printf("Animal %d, Dog %d, HouseDog %d \n", super.num, , this.num);
	}
}

public class InheSample {
	public static void main(String[] args) {
//		Dog dog = new Dog();	// Dog 객체 생성
//		dog.setName("바둑이");
//		System.out.println(dog.name);	// 기본적인 상속의 형태
//		dog.sleep();
//		HouseDog hd = new HouseDog("성지");
//		hd.setName("윤지");
//		hd.sleep();
//		hd.sleep("잘");	// 다중정의 메서드 호출 시 입력 주의
//		System.out.println(hd.name);
//		HouseDog hd2 = new HouseDog();
//		hd2.numPrint();
		Animal a = new Animal();
		Dog d = new Dog();
		HouseDog hd = new HouseDog();
		
		Animal a2 = (Animal)new Dog();	// 다형성: 부모가 자식 객체를 가리키는 것은 가능.upcasting(부모타입으로 변환이 됨.)
		Animal a3 = new HouseDog();
		Dog d2 = new HouseDog();
		
//		HouseDog hd2 = new Dog();	// 자식이 부모객체를 가리키는 것은 불가능.downcasting
		// downcasting은 그냥 이루어지지 않음.(조건 필요)
		
		
	}
}
