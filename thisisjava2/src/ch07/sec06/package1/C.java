package ch07.sec06.package1;

import ch07.sec06.package1.A;

public class C {
	//메소드 선언
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();			//같은 패키지가 아니기 때문에 직접 호출 불가능
	}
}
