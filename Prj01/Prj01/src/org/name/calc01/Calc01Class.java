package org.name.calc01;

import java.util.Scanner;

public class Calc01Class {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		String str = sc.nextLine();
		//엔터 전까지의 값을 출력
		
		System.out.print("나이: ");
		int inputD = sc.nextInt();
		//정수 값을 찾아서 출력
		
		sc.nextLine();
		//13행과 22행 사이의 17행의 함수를 입력하지 않으면 에러
		//선행 했던 엔터키가 남아있기 때문에 버려주는 역할을 함.
		//숫자를 입력한 뒤 문자를 입력할 때 사용
		
		System.out.print("주소: ");
		String str1 = sc.nextLine();
		
		System.out.println(str + inputD + str1);
		sc.close();
		
		/* 2개의 정수를 입력 받아서 +, -, *, /를 출력하세요.
		 * int num1, num2;
		
		System.out.print("num1: ");
		int numA = sc.nextInt();
		System.out.print("num2: ");
		int numB = sc.nextInt();
		
		System.out.println("num1 + num2: " + (numA + numB));
		System.out.println("num1 - num2: " + (numA - numB));
		System.out.println("num1 * num2: " + numA * numB);
		System.out.println("num1 / num2: " + numA / numB);
		
		*/
		
	}
}


