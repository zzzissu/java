package ch04.sec04;

public class SumFrom1to100Example {
	public static void main(String[] args) {
		int sum = 0; //누적시키는 변수는 반드시 0으로 초기화
		int i;
		
		for(i=1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}
}
