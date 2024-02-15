package ch13.sec01;

public class GenericExample {
	public static void main(String[] args) {
		//Box<String> box1 = new Box<Sting>();
		Box<String> box1 = new Box<>();		//앞<>파라미터에서 String타입을 선언해주었기 때문에 뒤<>파라미터에 굳이 설정해주지 않아도 됨 
		box1.content = "안녕하세요.";
		String str = box1.content;
		System.out.println(str);			//Box를 생성할 때 타입 파라미터 T대신 String으로 대체
		
		//Box<Integer> box2 = new Box<Integer>();
		Box<Integer> box2 = new Box<>();
		box2.content = 100;
		int value = box2.content;
		System.out.println(value);			//Box를 생성할 때 타입 파라미터 T대신 Integer로 대체
	}
}
