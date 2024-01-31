package ch03.sec06;

public class CompareOperatorExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2);  //65< 66
		System.out.println("result4: " + result4);
		
		int num3 = 1;
		double num4 = 1.0;
		boolean result5 = (num3 == num4);
		System.out.println("result5:" + result5);
		//int가 double형태로 변환되어 계산
		
		float num5 = 0.1f;
		double num6 = 0.1;
		boolean result6 = (num5 == num6);
		boolean result7 = (num5 ==(float)num6);
		System.out.println("result6: " + result6);
		System.out.println("result7: " + result7);
		//result6은 정밀도에 따라 f는 7자리, d는 15자리이기 때문에 거짓으로 나옴
		
		String str1 = "자바";
		String str2 = "Java";
		boolean result8 = (str1.equals(str2));
		boolean result9 = (! str1.equals(str2));
		System.out.println("result8: " + result8);
		System.out.println("result9: " + result9);
		//equals는 문자열에만 사용
		//값이 같은지 보는 것이 아닌, 문자열이 같은지 보기 위함이기 때문에 등호 사용x
		//두 값이 주소 값이 같다면 등호로 사용하지만 주소 값이 같지 않거나 주소 값을 알아 볼 것이 아니라면 사용x
		
	}
}
