package ch06.sec07.exam02;

public class Korean {
	String nation = "대한민국";
	String name;
	String ssn;
	
	public Korean(String n, String s) {
		name = n;
		ssn =s;
	}
	public Korean() { //default 생성자
		int n = 100;
		System.out.println("나는 디폴트생성자 입니다.");
		System.out.println("n: " + n);
	}
}
