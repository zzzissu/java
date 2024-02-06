package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.*;

public class C {
	public C() {
		//객체 생성
		A a = new A();
		
		//필드 값 변경
		a.field1 = 1;	//o
//		a.field2 = 1;	//x			//default 필드 접근 불가
//		a.field3 = 1;	//x			//private 필드 접근 불가
		
		//메소드 호출
		a.method1();	//o
//		a.method2();	//x			//default 필드 접근 불가
//		a.method3();	//x			//private 필드 접근 불가
	}
}
