package ch04.sec03;

public class SwitchExpressionsExample {
	public static void main(String[] args) {
		char grade = 'B';
		//조건이 제한적이면 switch문 사용, 여러가지이면 if문을 사용하는 것이 좋음
		switch(grade) {
			case 'A', 'a' -> {
				System.out.println("우수 회원입니다.");
				//'->(표현식)'화살표로 의미 전달
			}
			case 'B', 'b'-> {
				System.out.println("일반 회원입니다.");
			}
			default -> {
				System.out.println("손님입니다.");
			}
		}
		
		switch(grade) {
			case 'A', 'a' -> System.out.println("우수 회원입니다.");
			case 'B', 'b' -> System.out.println("일반 회원입니다.");
			default -> System.out.println("손님 입니다.");
			//중괄호 안에 실행문이 하나만 있을 경우에는 중괄호를 생략할 수 있다.
		}
	}
}
