package ch02.sec01;

public class VatiableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:"+ x +",y:"+ y);
		
		int temp = x;
		//x에 저장된 3이라는 값을 temp에 대입 > tamp = 3
		x = y;
		//y의 값을 x에 대입 > x=5
		y = temp;
		//y에 temp 값을 대입 > y=3
		
		//변수는 또 다른 변수에 대입되어 메모리 간에 값을 복사.
		//두 변수의 값을 교환하는 방법을 보여준다. 새로운 변수 temp 선언
		System.out.println("x:"+ x + ",y:" + y);
	} 
}
