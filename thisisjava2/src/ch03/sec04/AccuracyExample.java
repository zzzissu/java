package ch03.sec04;

public class AccuracyExample {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		System.out.println("사과 1개에서 남은 양: " + result);
	}
}
/* int apple =1;
 * double pieceUnit = 0.1f;
 * int number = 7;
 * 
 * double result = apple - number*pieceUnit;
 * System.out.println("사과 1개에서 남은 양 : %.1f\n", result);
 * 
 * 소숫점 한 자리만 나타내고 싶을 경우 위와 같이 작성.
 * 두 자리를 나타 낼때에는 %.2f로 작성.
 */