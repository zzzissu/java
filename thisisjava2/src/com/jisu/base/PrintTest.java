package com.jisu.base;

public class PrintTest {
	public static void main(String[] args) {
		String name ="한지수";
		int age = 27;
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("제 이름은 " + name + " 나이는 " + age + "입니다.");
		System.out.printf("제 이름은 %s이고 나이는 %d입니다.", name, age);
		/*printf를 사용할 때에는 %뒤에 d(정수),f(실수), S(문자열)로
		 * 선언된 변수를 집어넣을 수 있다. 출력할 내용("")가 끝나면 , 뒤에 선언된 변수를 입력한다. 
		 */
	} 
}
