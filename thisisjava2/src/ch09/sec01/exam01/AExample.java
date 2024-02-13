package ch09.sec01.exam01;

public class AExample {
	public static void main(String[] args) {
		//A 객체 생성
		A a = new A();
		
		//B 객체 생성
		A.B b = a.new B();
		System.out.println(b.toString());	//A$B@587c290d로 출력 클래스 A로서 클래스 B가 출력
		//A가 없으면 B 호출이 안됨
	}
}
