package ch05.sec05;

public class SubStringExample {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		//(n, n)으로 콤마를 쓰면 범위를 지정해서 잘라줌
		//자르는 부분은 6번 앞까지 자름
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
		//입력한 숫자 순서부터 끝까지 출력
	}
}
