package com.jisu.base;

import java.util.Scanner;

public class PrintTest2 {
	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		String strX = scanner.nextLine();
		// 이름은 문자열로 작성할 것이기 때문에 int형으로 변환 X
		
		System.out.print("나이를 입력하세요: ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		//int형으로 변환하는 과정이 귀찮으면 scanner.nextInt로 작성
		
		scanner.close();
	}
}
