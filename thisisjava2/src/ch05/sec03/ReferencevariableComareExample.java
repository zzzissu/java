package ch05.sec03;

public class ReferencevariableComareExample {
	public static void main(String[] args) {
		int[] arr1; //배열 변수 arr1 선언
		int[] arr2; //배열 변수 arr2 선언
		int[] arr3; //배열 변수 arr3 선언
		//클래스 안에 작성해야함
		// int arr1[];로 작성해도 가능하지만 객체지향 언어에서는 위와 같이 작성.
		
		arr1 = new int[] {1, 2, 3 }; //배열 {1, 2, 3}을 생성하고 arr1 변수에 대입 //heap영역에 저장
		arr2 = new int[] {1, 2, 3 }; //배열 {1, 2, 3}을 생성하고 arr2 변수에 대입 //arr1과 값이 같을 뿐 주소는 다름
		arr3 = arr2; //배열 변수 arr2의 값을 배열 변수 arr3에 대입
		
		System.out.println(arr1 == arr2); //arr1과 arr2 변수가 같은 배열을 참조하는지 검사
		
		System.out.println(arr2 == arr3); //arr2와 arr3 변수가 같은 배열을 참조하는지 검사
	}
}
//배열 : 동일한 타입의 자료형을 연속적으로 저장할때 사용
