package ch03.sec10;

public class AssignmentOperatorExample {
	public static void main(String[] args) {
		int result = 0;
		result += 10; //result = result + 10;
		System.out.println("result=" + result);
		result -= 5; 
		System.out.println("result=" + result);
		result *= 3;
		System.out.println("result=" + result);
		result /= 5;
		System.out.println("result=" + result);
		result %= 3;
		System.out.println("result=" + result);
		
		int result1 = 100;
		int res = 0;
		res = (result1 != 100) ? 1:0;
		System.out.println(res);
	}
}
