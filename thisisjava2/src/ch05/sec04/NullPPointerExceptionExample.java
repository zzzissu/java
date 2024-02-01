package ch05.sec04;

public class NullPPointerExceptionExample {
	public static void main(String[] args) {
		int[] intArray = null;
		//intArray[0] = 10; //NullPPointerException
		
		String str = null;
		//System.out.println("총 문자 수: " + str.length() ); //NullPPointerException
	}
}
