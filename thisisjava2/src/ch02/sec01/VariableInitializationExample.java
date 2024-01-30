package ch02.sec01;

public class VariableInitializationExample {
	public static void main(String[] args) {
		//변수 value 선언
		
		//int value;
		int value = 100;
		/*value 변수선언을 하고 초기화를 하지 않았기 때문에 에러가 발생
		 * 대입 연산자를 통해 값을 초기화해줘야 함*/
		
		//연산 결과를 변수 result의 초기값으로 대입
		int result = value + 10;
		
		//변수 result 값을 읽고 콘솔에 출력
		System.out.println(result);
	}
}
