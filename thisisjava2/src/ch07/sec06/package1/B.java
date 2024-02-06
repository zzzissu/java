package ch07.sec06.package1;

public class B {
	//메소드 선언
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();				//디폴트 생성자로 대체 가능, 굳이 prorected로 사용 하지 않음
	}
}
