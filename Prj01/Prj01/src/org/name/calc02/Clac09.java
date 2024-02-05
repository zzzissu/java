package org.name.calc02;
//실패
import java.util.Scanner;

public class Clac09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		Clac08 c = new Clac08(a, b);
		
		System.out.println("숫자를 입력하세요.");
		int a = sc.nextInt();
		
		System.out.println("숫자를 입력하세요.");
		int b = sc.nextInt();
		sc.nextLine(); 
		
		
//		c.printClac08();
		
		System.out.println("연산자를 입력하세요.");
		String num3 = sc.nextLine();
		
		if (num3.equals("+")) {
			System.out.println(a + b);
		} else if (num3.equals("-")) {
			System.out.println(a - b);
		} else if (num3.equals("*")) {
			System.out.println(a * b);
		} else if (num3.equals("/")) {
			System.out.println(a / b);
		}
	}
}
