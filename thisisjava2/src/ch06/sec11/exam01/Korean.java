package ch06.sec11.exam01;

public class Korean {
	//인스턴스 final 필드 선언
	final String nation = "대한민국";
	final String ssn;		//생성자를 통해 초기화 시켜줘야 함
	
	//인스턴스 필드 선언
	String name;
	
	//생성자 선언
	public Korean(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
//메서드 앞에도 final 키워드를 사용 가능(오버로딩 하지말라는 의미 == 재 정의 하지말라는 의미)
//class 앞에도 final 키워드를 사용 가능(상속 하지말라는 의미)
//필드 앞에도 final 키워드를 사용 가능(값을 바꾸지 말라는 의미) 