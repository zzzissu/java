package com.jisu.base;

public class PrintTest3 {
	public static void arrPrint(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.printf("a[%d]: %d\n", a[i]);
			//호출은 main에서 해야함
		}
	}
	
	public static void main(String[] args) {
		
		int[]  ary = {10, 20, 30, 40, 50}; //배열 선언과 동시에 초기화
		for(int i=0; i<ary.length; i++) {
			System.out.printf("ary[i]: %d\n", i, ary[i]);
			//System.out.println("ary[" + i + "] : " + ary[i]); 이런 방식도 가능
		}
		
		int[] ary1;    //배열 선언
		ary1 = new int[] {50, 60, 70, 80, 90, 100}; //나중에 초기화 할때는 객체를 생성해서 삽입
		//배열 선언과 초기화가 분리되면 명시적으로 객체생성(new 연산자를 통해서 배열객체 생성)
		
		for(int i=0; i<ary1.length; i++) {
			System.out.printf("ary1[%d]: %d\n", i, ary1[i]); //%d 개수만큼 뒤에 구분해줘야 한다.
			//System.out.printf("ary1[%d]: %d\n",ary1[i]) = 오류
			
			//System.out.println("ary1[" + i + "] : " + ary1[i]);
		}
		arrPrint(new int[] {1, 2, 3}); 
		//함수정의에서 객체 생성을 하지 않았으면 함수호출 부분에서 새로운 객체를 생성(new 타입[] {값})해서 호출해야함
		
		arrPrint(ary);
	} //매개변수 입력 > 메서드 가능(객체)
} //속성 = 멤버변수
