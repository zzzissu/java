package ch03.sec07;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode = 'A';
		//int charCode = 'a';
		//int charCode = '5';
		
		if( (65<=charCode) & (charCode<=90) ) {
			System.out.println("대문자이군요.");
			//앞 항이 거짓이어도 뒤 항을 연산함.
			//비트연산자
		}
		
		if( (97<=charCode) && (charCode<=122) ) {
			System.out.println("소문자이군요.");
			//논리곱은 하나라도 거짓이 되어버리면 뒤에 연산을 하지않아버림.(앞의 연산이 거짓이면 뒤 연산의 필요성을 잃어버림)
			//앞의 항이 거짓이면 뒤 항이 참인지 거짓인지 할 필요가 없어짐(앞 항이 참이어야 뒤 항으로 넘어감)
			//논리연산자
		}
		
		if( (48<=charCode) && (charCode<=57) ) {
			System.out.println("0~9 숫자이군요.");
		}
		
		//---------------------------------
		
		int value = 6;
		//int value = 7;
		
		if( (value%2==0) | (value%3==0) ) {
			System.out.println("2 또는 3의 배수이군요.");
		}
		
		boolean result = (value%2==0) || (value%3==0);
		if( !result ) {
			System.out.println("2 또는 3의 배수가 아니군요.");
		}
	}
}
