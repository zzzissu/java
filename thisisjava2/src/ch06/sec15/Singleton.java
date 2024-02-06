package ch06.sec15;

public class Singleton {
	//prinvate 접근 권한을 갖는 정적 필드 선언과 초기화
	//자기의 객체를 생성한다.
	private static Singleton singleton = new Singleton();
	
	//private 접근 권한을 갖는 생성자 선언
	//외부에서 생성자 사용(호출)을 차단한다.
	private Singleton() {
		
	}
	
	//public 접근 권한을 갖는 정적 메소드 선언
	//getter()를 통해서 생성한 객체를 보내준다.
	public static Singleton getInstance() {
		return singleton;
	}
}
