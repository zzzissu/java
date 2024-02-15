package thread;

public class ThreadOne {
	public static void main(String[] args) {
		Thread tr = Thread.currentThread();
		System.out.println(tr.getName());
		//객체 생성 없이 메소드에 접근하고 있음
		//클래스 이름을 통해서 값을 받고 있음
		//클래스가 static멤버라는 의미
	}
}
