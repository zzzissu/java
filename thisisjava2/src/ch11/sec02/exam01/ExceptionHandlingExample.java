package ch11.sec02.exam01;

public class ExceptionHandlingExample {
	public static void printLength(String data) {
		int result = data.length();
		//data가 null일 경우 ,NullPointException 발생
		System.out.println("문자 수: " + result);
	}
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("ThisIsJava");	//10글자
		printLength(null);		//매개값으로 null 대입
		//null = 참조하는 값이 없음
		System.out.println("[프로그램 종료]");
	}
}
