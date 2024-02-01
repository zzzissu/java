package org.name.calc02;

import java.util.Scanner;

public class Calc03Class {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 단을 출력할까요.");
		int num1 = sc.nextInt();
		System.out.println("*** " + num1 + "단 ***");

		
			for(int n=1; n<=9; n++) {
				System.out.println(num1 + " x " + n + " = " + (num1*n));
			}
	}
}
