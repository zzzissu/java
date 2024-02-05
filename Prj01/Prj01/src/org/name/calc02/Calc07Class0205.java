package org.name.calc02;

import java.util.Scanner;

public class Calc07Class0205 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
	System.out.println("숫자를 입력하세요.");
	int a = sc.nextInt();
	
	System.out.println("숫자를 입력하세요.");
	int b = sc.nextInt();
	sc.nextLine(); 
	
	Calc06Class0205 c = new Calc06Class0205(a, b); 
	//Calc06 클래스를 c로 호출
	//생성자에서 a와 b를 가져옴(a, b는 입력받아서 출력)
//	Calc06에서 호출해 왔기 때문에 아래에서 호출해 온 값(원하는 값)을 출력
	
	
//	Calc06에서 이미 System.out.println("a + b: " + (a+b));으로 출력값을 입력 해줬기 때문에 따로 출력하지 않아도 됨
//	main 클래스에서 출력을 하려면 
//	int (plus) = c.plus(); 
//	System.out.println(plus); 로 작성
//	(plus)는 이름을 지어준 것으로 아무것도 연관이 없음.
	c.plus();
	c.sub();
	c.mul();
	c.div();
	
	}
}
