package ch03.sec08;

public class BitLogicExample {
	public static void main(String[] args) {
		System.out.println("45 & 25 = " + (45 & 25));
		// 45 = 0010 1101
		// 25 = 0001 1001
		//      0000 1001 = 9 와 같이 계산
		System.out.println("45 | 25 = " + (45 | 25));
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		System.out.println("~45 = " + (~45));
		// ~는 비트를 반전시키는 연산자
		// 45(0010 1101)= 1101 0010 = 1(부호비트 고정)010 1101 + 1 = 1010 1110
		// -46의 값이 나옴
		System.out.println("-------------------------");
		
		byte receiveData = -120;
		
		//방법1: 비트 논리곱 연산으로 Unsigned 정수 얻기
		int unsignedInt1 = receiveData & 255;
		System.out.println(unsignedInt1);
		
		//방법2: 자바 API를 이용해서 Unsigned 정수 얻기
		int unsignedInt2 = Byte.toUnsignedInt(receiveData);
		System.out.println(unsignedInt2);
		
		int test = 136;
		byte btest = (byte)test;
		System.out.println(btest);
	}
}
