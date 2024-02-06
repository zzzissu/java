package ch07.sec02;

public class SmartPhoneExample {
	public static void main(String[] args) {
		//SmartPhone 객체 생성
		SmartPhone myPhone = new SmartPhone("갤럭시", "은색");
		//SmartPhone myPhone = new SmartPhone();	//디폴트 생성자 읽기
		//상속을 받게 되면 자동적으로 부모객체도 생성되어서 호출이 됨
		//호출은 자식생성자를 먼저 호출, 실행은 부모생성자를 먼저 실행
		
		//Phone으로부터 상속받은 필드 읽기
		System.out.println("모델: " + myPhone.model);
		System.out.println("색상: " + myPhone.color);
		
		//SmartPhone의 필드 읽기
		System.out.println("와이파이 상태: " + myPhone.wifi);
		
		//Phone으로부터 상속받은 메소드 호출
		myPhone.bell();
		myPhone.sendVoice("여보세요.");
		myPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
		myPhone.sendVoice("아~ 네, 반갑습니다");
		myPhone.hangUp();
		
		//SmartPhone의 메소드 호출
		myPhone.setWifi(true);
		myPhone.internet();
	}
}
