package org.name.calc02;

import java.util.Scanner;

public class Calc05Class {
	public static void sum(int a,int b) {
		System.out.printf("%d + %d = %d", a, b, a+b);
	}// 메서드 호출
	public static void sub(int a, int b) {
		System.out.printf("%d - %d = %d", a, b, a-b);
	}
	public static void mul(int a, int b) {
		System.out.printf("%d * %d = %d", a, b, a*b);
	}
	public static void div(int a, int b) {
		System.out.printf("%d / %d = %f", a, b, (double)a/b);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			boolean num = true;
		
		while(num) {
			
		System.out.println("숫자를 입력하세요.");
		int num1 = sc.nextInt();
		
		System.out.println("숫자를 입력하세요.");
		int num2 = sc.nextInt();
		
		sc.nextLine(); 
		
		System.out.println("연산자를 입력하세요.");
		String num3 = sc.nextLine();
		
		
		if (num3.equals("+")) {
			sum(num1, num2);
		} else if (num3.equals("-")) {
			sub(num1, num2);
		} else if (num3.equals("*")) {
			mul(num1, num2);
		} else if (num3.equals("/")) {
			div(num1, num2);
		}
		
		System.out.println("\n계속하려면 y, 멈추려면 q를 눌러주세요.");
		//윗 줄과 한칸 띄우려면 \n을 사용
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
/* 두개의 매개변수를 갖는 메서드 정의와 호출
 * public static void methodTest(int a, int b) {
 * 	System.out.printlnf("methodTest!!: %d, %d", a, b);
 * }
 * 
 * int num = 10;
 * int num1 = 20;
 * methodTest(num, num1);
 * --------------------------------
 * int[] ary = {1, 2, 3}; //1차원 배열
 * int[2][3] ary1 = {{1, 2, 3},{4, 5, 6}}; //2차원 배열(대괄호가 두개), 2행 3열의 값이라는 뜻
 * length(값의 개수를 세어줌)
 * */
