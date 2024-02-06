package ch06.sec10.exam01;

public class Calculator {
	static double pi = 3.14159;
	//선언과 동시에 초기화 시켜야함.
	//static은 바로 메모리가 할당되기 때문
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
}
