package org.name.calc02;

import java.util.Scanner;

public class Calc02Class {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int numA = sc.nextInt();
		
		System.out.println("숫자를 입력하세요.");
		int numC = sc.nextInt();
		
		sc.nextLine(); //숫자 다음 문자를 입력 할때에는 무조건 사용해야함.
		
		System.out.println("연산자를 입력하세요.");
		String numB = sc.nextLine();
		
		if (numB.equals("+")) {
			System.out.println(numA + numC);
		} else if (numB.equals("-")) {
			System.out.println(numA - numC);
		} else if (numB.equals("*")) {
			System.out.println(numA * numC);
		} else if (numB.equals("/")) {
			System.out.println(numA / numC);
		}
		
	}
}
