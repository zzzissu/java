package com.jisu.base;

import java.util.Scanner;

public class PrintTest2 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		//객체를 생성하는 방법이 new키워드를 통해 생성자를 호출(생성자는 클래스랑 이름이 같은 매서드를 말한다.)
		// 객체를 생성해서 선언된 변수에 넣음. 주소 값을 넣는 과정
		System.out.print("이름을 입력하세요: ");
		String strX = sc.nextLine();
		// 이름은 문자열로 작성할 것이기 때문에 int형으로 변환 X
		
		System.out.print("나이를 입력하세요: ");
		String strY = sc.nextLine();
		int y = Integer.parseInt(strY);
		//int형으로 변환하는 과정이 귀찮으면 scanner.nextInt로 작성
		
		sc.close();
	}
}
