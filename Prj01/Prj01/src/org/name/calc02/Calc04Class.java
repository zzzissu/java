package org.name.calc02;

import java.util.Scanner;

public class Calc04Class {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean num = true;
		
		while(num) {
			//while문에서 while(true)를 사용하면 무한반복하겠다는 신호.
		System.out.println("숫자를 입력하세요.");
		int num1 = sc.nextInt();
		
		System.out.println("숫자를 입력하세요.");
		int num2 = sc.nextInt();
		
		sc.nextLine(); //숫자 다음 문자를 입력 할때에는 무조건 사용해야함.
		
		System.out.println("연산자를 입력하세요.");
		String num3 = sc.nextLine();
		
		if (num3.equals("+")) {
			System.out.println(num1 + num2);
		} else if (num3.equals("-")) {
			System.out.println(num1 - num2);
		} else if (num3.equals("*")) {
			System.out.println(num1 * num2);
		} else if (num3.equals("/")) {
			System.out.println(num1 / num2);
		}
		
		System.out.println("계속하려면 y를 눌러주세요.");
		String num4 = sc.nextLine();
		
			if (num4.equals("y")) {
			continue;
		 	} else if (num4.equals("q")) {
			num = false;
		}
	} 
		System.out.println("프로그램 종료");
}
}
