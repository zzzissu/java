package ch02.sec10;

public class PrimitiveandStringConversionExample {
	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");
		//Integer value11 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		// 문자열을 기본타입으로 변환할 때 Integer, Double, Boolean과 같이
		// 대문자로 시작하는 것은 기본자료형이 변환시킨 객체로 볼 수 있다.
		// int는 풀네임으로 써줘야 함
		
		System.out.println("value1: " + value1);
		//System.out.println("value11: " + value11);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
	}
}
