package org.name.calc02;
	//2개의 정수를 입력받는 생성자 만들어서 객체 생성
	//그 객체를 통해 메서드 (+ - * /) 생성
public class Calc06Class0205 {
	int a;
	int b;
	
	Calc06Class0205(int a, int b) {
		this.a = a;
		this.b = b;
	}	//여기서 이미 입력을 받았기 때문에 아래(public int plus())에서 plus()괄호 안에 입력하지 않아도 됨 
	
	public int plus() {
		int a1 = (a+b);
		System.out.println("a + b: " + (a+b));
		return a1;
	}
		void sub() {
//			int a2 = (a-b);
			System.out.println("a - b: " + (a-b));
//			return a2;
			//a2를 함수호출 하지 않으면 리턴이 필요없음

	}
		int mul() {
			int a3 = (a*b);
			System.out.println("a * b: " + (a*b));
			return a3;
	}
		int div() {
			int a4 = (a/b);
			System.out.println("a / b: " +(a/b));
			return a4;
	}
}