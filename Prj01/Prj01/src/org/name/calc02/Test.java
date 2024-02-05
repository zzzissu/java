package org.name.calc02;

public class Test {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		double x = 1.2;
		double y = 2.4;
		
		plus(a, b);
		plus(x, y);
		plus(a);
		plus(a, x);		//자동 형변환
		plus(x, a);
	}
		public static void plus(int a, int b) {
			int res = a + b;
			System.out.printf("res: %d\n", res);
	}
		public static void plus(double x, double y) {	//입력값이 다르면 동일한 형태의 이름을 사용할 수 있음
			double res = x + y;							//원래는 이름이 같은 함수를 사용할 수 없음
			System.out.printf("res: %f\n", res);	//실수 이기 때문에 %f
		}	//메서드 오버로딩
		public static void plus(int a) {
			int res = a;
			System.out.printf("res: %d\n", res);
		}
}
